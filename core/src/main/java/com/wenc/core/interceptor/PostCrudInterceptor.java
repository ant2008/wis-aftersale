package com.wenc.core.interceptor;

import cn.hutool.core.util.StrUtil;
import com.wenc.sys.service.TokenService;
import com.wenc.sys.service.UserRightService;
import com.wenc.commdomain.exception.NullTokenException;
import com.wenc.commdomain.pojo.core.VFuncRight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 提交修改拦截器
 *
 * @author bruce
 * @date 2019.04.19
 */
@Component
public class PostCrudInterceptor implements HandlerInterceptor {

    private final String Jwt_Auth = "Authorization";


    private Logger LOG = LoggerFactory.getLogger(PostCrudInterceptor.class);

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserRightService userRightService;

    private static final String[] IGNORE_URI =
            {"/login.jsp",
                    "login",
                    "/validate/",
                    "/index/",
                    "CheckLoginInterval",
                    "/CheckLoginInterval",
                    "index",
                    "index/",
                    "index.html",
                    "index.jsp",
                    "validate",
                    "exit",
                    "/exit"
            };


    /**
     * 对crud提交进行拦截。
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI().toString();

        String token = "";
        String userid = "";

        VFuncRight vFuncRight = null;

        String methodName = "";


        HandlerMethod handlerMethod = null;

        String funcNo = "";

        String splitMethName = "";

        try {

            LOG.debug("uri:{}", uri);


            //转化出func,/**/name.
            handlerMethod = (HandlerMethod) handler;

            if (handlerMethod == null) {
                return false;
            }


            methodName = handlerMethod.getMethod().getName();

            //首字母大写
            methodName = StrUtil.upperFirst(methodName);

            //形式:/xxx/methodname/

            // splitMethName = uri.trim().toUpperCase().indexOf(methodName.trim().toUpperCase());

            funcNo = uri
                    .trim()
                    .substring(1,
                            uri.trim().indexOf(methodName.trim()) - 1);

            if (funcNo == null && funcNo.trim().equals("")) {
                throw new Exception("提交url校验无效,无法获取系统功能号!");
            }


            //判断功能号后是否存在其他字符
            if(funcNo.trim().lastIndexOf("/") > 0 )
            {
                funcNo = funcNo.trim().substring(0,funcNo.trim().length() - 1);
            }

            if(funcNo.trim().startsWith("/"))
            {
                funcNo = funcNo.trim().substring(1);
            }


            token = request.getHeader(Jwt_Auth);

            if (token == null || token.trim().equals("")) {
                throw new NullTokenException("提交头部无token信息!");
            }

            userid = tokenService.parseTokenKey(token);

            if (userid == null || userid.trim().equals("")) {
                return false;
            }

            //根据用户ID进行校验
            vFuncRight = userRightService.getFuncByUseridAndFuncno(userid, funcNo.trim().toLowerCase());

            if (vFuncRight == null) {
                throw new Exception("用户ID:" + userid + "没有[" + funcNo + "]的权限!");

            }


            //根据方法名称判断不同的权限。
            //修改
            if (methodName.toLowerCase().trim().equals("editpost")) {
                if (vFuncRight.getModr() == null || vFuncRight.getModr() == 0) {
                    LOG.debug("用户ID{}没有{}的查询权限", userid, funcNo.toLowerCase());
                    throw new Exception("用户ID:" + userid + "没有[" + funcNo + "]的修改权限!");

                }

            } else if (methodName.toLowerCase().trim().equals("createpost")) {
                if (vFuncRight.getAddr() == null || vFuncRight.getAddr() == 0) {
                    LOG.debug("用户ID{}没有{}的查询权限", userid, funcNo.toLowerCase());
                    throw new Exception("用户ID:" + userid + "没有[" + funcNo + "]的增加权限!");

                }

            } else if (methodName.toLowerCase().trim().equals("delpost")) {
                if (vFuncRight.getDelr() == null || vFuncRight.getDelr() == 0) {
                    LOG.debug("用户ID{}没有{}的查询权限", userid, funcNo.toLowerCase());
                    throw new Exception("用户ID:" + userid + "没有[" + funcNo + "]的删除权限!");

                }

            } else {
                throw new Exception("用户ID:" + userid + "没有[" + funcNo + "]的操作权限!");
            }


            return true;


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
