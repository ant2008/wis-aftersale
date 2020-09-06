package com.wenc.core.config;

import com.wenc.core.interceptor.PageQueryInterceptor;
import com.wenc.core.interceptor.PostChkInterceptor;
import com.wenc.core.interceptor.PostCrudInterceptor;
import com.wenc.core.interceptor.PostPrtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 拦截类配置文件
 * <p>notes:暂时不启用</p>
 *
 * @author bruce
 * @date 2019/04/19
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private PageQueryInterceptor pageQueryInterceptor;


    @Autowired
    private PostCrudInterceptor postCrudInterceptor;


    @Autowired
    private PostChkInterceptor postChkInterceptor;

    @Autowired
    private PostPrtInterceptor postPrtInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new PostAddInterceptor());

        //正常拦截配置。
        //CreatePost
        //registry.addInterceptor(new PostAddInterceptor()).addPathPatterns("/AddPost/").addPathPatterns("/CreatePost/");

        //拦截查询
        registry.addInterceptor(pageQueryInterceptor)
                .addPathPatterns("/**/PageQuery")
                .excludePathPatterns("/MRoleFunc/PageQuery")
                .excludePathPatterns("/MFunc/PageQuery")
                .excludePathPatterns("/MRoleFunc/PageQuery")
                .excludePathPatterns("/MRole/PageQuery");


        //拦截审核
        registry.addInterceptor(postChkInterceptor)
                .addPathPatterns("/**/CheckPost")
                .addPathPatterns("/**/UnCheckPost");

        //拦截crud
        registry.addInterceptor(postCrudInterceptor)
                .addPathPatterns("/**/CreatePost")
                .addPathPatterns("/**/EditPost")
                .addPathPatterns("/**/DelPost")
                .excludePathPatterns("/MFunc/EditPost")
                .excludePathPatterns("/MFunc/CreatePost")
                .excludePathPatterns("/MRoleFunc/EditPost")
                .excludePathPatterns("/MRoleFunc/CreatePost");


        //拦截打印
        registry.addInterceptor(postPrtInterceptor)
                .addPathPatterns("/**/Prt")
                .addPathPatterns("/**/PrePrt")
                .addPathPatterns("/**/ExportExcel")
                .addPathPatterns("/**/ExportExcelAll")
                .addPathPatterns("/**/GetExportAllData")
                .addPathPatterns("/**/DownExcel");

    }


}
