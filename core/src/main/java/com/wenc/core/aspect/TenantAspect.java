package com.wenc.core.aspect;

import com.wenc.commdomain.pojo.core.SsFuncH;
import com.wenc.core.config.FuncExcludeConfig;
import com.wenc.sys.service.TokenService;
import com.wenc.core.util.TenantSqlHelper;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Map;

/**
 * 通过aop模式在controller模式下查询自动加入tenant_id模式。
 *
 * <p>notes:在尚未有更好的模式前，tenantId通过硬代码实现。</p>
 *
 * @author b.v
 * @date 2019-04-25
 */
@Aspect
@Component
public class TenantAspect {

    private Logger LOG = LoggerFactory.getLogger(TenantAspect.class);


    @Autowired
    private TokenService tokenService;

    @Autowired
    private FuncExcludeConfig funcExcludeConfig;


    //* com.wenc.core.service.GenericBaseService.*pageQuery(..)

    /**
     * 进行页面查询的aop
     */
    @Pointcut("execution(* com.wenc.core.dao.BaseDao.*pageQuery(..))")
    public void pageQueryPointcut() {

    }

    /**
     * 进行页面只带参数的aop
     */
    @Pointcut("execution(* com.wenc.core.dao.BaseDao.pageCount(..))")
    public void pageCountPointcut() {
    }


    //  @Pointcut("@annotation(org.springframework.data.jpa.repository.Query)")
    public void queryPointcut() {
    }


    /**
     * 执行pageQuery时自动插入tenant_id = "" 的语句。
     *
     * @param proceedingJoinPoint
     */
    @Around("pageQueryPointcut()")
    public Object doAroundPageQuery(ProceedingJoinPoint proceedingJoinPoint) {

        //获取目标方法的参数信息
        Object[] paramObjs = proceedingJoinPoint.getArgs();


        Object[] newObj = null;

        String userId = "";

        String token = "";


        String tenantId = "";

        String jpql = "";

        String funcNo = "";

        //需要排除的功能号
       // String[] excludeFuncs = {"SsFuncH","SsCode","SsRole","VbRoleFuncH","VbSysUser","SsTenant"};

        long excludeFound = 0;

        String orderByStr = "";
        String hqlStr = "";

        try {


            //不在token调用

            if (SecurityUtils.getSubject() != null && SecurityUtils.getSubject().getPrincipal() != null) {


                token = String.valueOf(SecurityUtils.getSubject().getPrincipal());

                userId = tokenService.parseTokenKey(token);


                //判断参数中是否存在tenantId,

                jpql = (String) paramObjs[0];

                final String tmpFunc = jpql;
                excludeFound = Arrays.stream(funcExcludeConfig.getExcludeFuncArray()).filter(o->tmpFunc.trim().indexOf(o.trim()) > 0 ).count();

                if (jpql != null &&
                        token != null &&
                        userId != null &&
                        excludeFound <=0
                    ) {


                    tenantId = tokenService.parseTokenTenant(token);


                    if (!TenantSqlHelper.ifExistTenantId(jpql)) {


                        //加入对order by 的处理。
                        if(jpql.trim().toUpperCase().indexOf("ORDER BY")>0)
                        {
                            //去掉order by，然后最后再加回来。
                            orderByStr = jpql.trim().substring(jpql.trim().toUpperCase().indexOf("ORDER BY"));

                            hqlStr = jpql.trim().substring(0,jpql.trim().toUpperCase().indexOf("ORDER BY") - 1);


                        }else
                        {
                            hqlStr = jpql.trim();
                        }


                        if(hqlStr.trim().toUpperCase().indexOf("WHERE") <= 0)
                        {
                            hqlStr = hqlStr + " where ( tenantId = '" + tenantId + "' ) ";
                        }else {

                            //debug
                            hqlStr = hqlStr + " and ( tenantId = '" + tenantId + "' ) ";
                        }

                        //需要把order加上
                        if(jpql.trim().toUpperCase().indexOf("ORDER BY")>0)
                        {
                            hqlStr = hqlStr + orderByStr;
                        }

                        System.out.println(hqlStr);
                    }else
                    {
                        hqlStr = jpql;
                    }


                    //重新组合查询
                    newObj = new Object[paramObjs.length];

                    for (int i = 0; i < paramObjs.length; i++) {

                        if (i == 0) {
                            newObj[i] =  hqlStr;
                        } else {
                            newObj[i] = paramObjs[i];
                        }
                    }

                    return proceedingJoinPoint.proceed(newObj);
                }
            }


            //继续原来的执行
            return proceedingJoinPoint.proceed(paramObjs);


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


        return null;

    }


    /**
     * 只带参数PageQuery aop
     *
     * @param proceedingJoinPoint
     * @return
     */
    @Around("pageCountPointcut()")
    public Object doPageCountPointcut(ProceedingJoinPoint proceedingJoinPoint) {
        //获取目标方法的参数信息
        Object[] paramObjs = proceedingJoinPoint.getArgs();

        //获取第一个参数。
        String jpql = "";

        Object[] newObj = null;

        String userId = "";

        String token = "";


        String tenantId = "";

        long excludeFound = 0;

        try {


            if (paramObjs == null) {
                return proceedingJoinPoint.proceed(paramObjs);
            }


            //不在token调用

            if (SecurityUtils.getSubject() != null && SecurityUtils.getSubject().getPrincipal() != null) {


                token = String.valueOf(SecurityUtils.getSubject().getPrincipal());

                userId = tokenService.parseTokenKey(token);


                jpql = (String) paramObjs[0];

                final String tmpFunc = jpql;
                excludeFound = Arrays.stream(funcExcludeConfig.getExcludeFuncArray()).filter(o->tmpFunc.trim().indexOf(o.trim()) > 0 ).count();


                if (jpql != null &&
                        token != null &&
                        userId != null &&
                        excludeFound <=0
                ) {


                    tenantId = tokenService.parseTokenTenant(token);


                    if (!TenantSqlHelper.ifExistTenantId(jpql)) {

                        if(jpql.trim().toUpperCase().indexOf("WHERE")<=0)
                        {
                            jpql = jpql + " where  ( tenantId = '" + tenantId + "' ) ";

                        }else {

                            //debug
                            jpql = jpql + " and ( tenantId = '" + tenantId + "' ) ";
                        }

                        System.out.println(jpql);
                    }


                    //重新组合查询
                    newObj = new Object[paramObjs.length];

                    for (int i = 0; i < paramObjs.length; i++) {

                        if (i == 0) {
                            newObj[i] =  jpql;
                        } else {
                            newObj[i] = paramObjs[i];
                        }
                    }

                    return proceedingJoinPoint.proceed(newObj);
                }
            }


            //继续原来的执行
            return proceedingJoinPoint.proceed(paramObjs);


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


        return null;

    }


    // @Around("queryPointcut()")
    public Object doQueryPoincut(ProceedingJoinPoint proceedingJoinPoint) {
        //获取目标方法的参数信息
        Object[] paramObjs = null;


        Object[] newObj = null;

        String userId = "";

        String token = "";


        String tenantId = "";

        String jpql = "";

        String queryValue = "";


        Query queyAnnotation = null;

        MethodSignature signature = null;

        Method method = null;

        InvocationHandler h = null;


        try {


            paramObjs = proceedingJoinPoint.getArgs();

            //从切面织入点处通过反射机制获取织入点处的方法
            signature = (MethodSignature) proceedingJoinPoint.getSignature();
            //获取切入点所在的方法
            method = signature.getMethod();


            // 获取注解中的操作方式
            if (method != null && !"".equals(method)) {
                // 获取自定义注解操作
                queyAnnotation = method.getAnnotation(Query.class);
                // 获取用户操作方式
                queryValue = queyAnnotation.value();

            }


            if (queryValue == null) {
                return proceedingJoinPoint.proceed(paramObjs);
            } else {
                jpql = queryValue;
            }


            //不在token调用

            if (SecurityUtils.getSubject() != null && SecurityUtils.getSubject().getPrincipal() != null) {


                token = String.valueOf(SecurityUtils.getSubject().getPrincipal());

                userId = tokenService.parseTokenKey(token);


                //jpql = (String) paramObjs[0];


                //判断参数中是否存在tenantId,


                if (jpql != null && token != null && userId != null) {


                    tenantId = tokenService.parseTokenTenant(token);


                    if (!TenantSqlHelper.ifExistTenantId(jpql)) {
                        //debug
                        jpql = jpql + " and ( tenantId = '" + tenantId + "' ) ";

                        System.out.println(jpql);
                    }

                    //重新设置注解
                    h = Proxy.getInvocationHandler(queyAnnotation);

                    // 获取 AnnotationInvocationHandler 的 memberValues 字段
                    Field hField = h.getClass().getDeclaredField("memberValues");
                    // 因为这个字段事 private final 修饰，所以要打开权限
                    hField.setAccessible(true);

                    Map memberValues = (Map) hField.get(h);

                    // 修改 value 属性值
                    memberValues.put("value", jpql);


                    System.out.println(queyAnnotation.value());

                    System.out.println(((MethodSignature) proceedingJoinPoint.getSignature()).getMethod().getAnnotation(Query.class).value());


//                    method.invoke(signature,queyAnnotation);


                    //重新组合查询
//                    newObj = new Object[paramObjs.length];
//
//                    for (int i = 0; i < paramObjs.length; i++) {
//
//                        if (i == 0) {
//                            newObj[i] = jpql;
//                        } else {
//                            newObj[i] = paramObjs[i];
//                        }
//                    }
//
//                    return   proceedingJoinPoint.proceed(newObj);
                }
            }


            //继续原来的执行
            return proceedingJoinPoint.proceed(paramObjs);


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


        return null;
    }


}
