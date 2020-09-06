package com.wenc.core.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
//@WebFilter(urlPatterns = "/*", filterName = "corsFilter")
public class CorsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) res;

        HttpServletRequest reqs = (HttpServletRequest) req;

        try {



            //response.setHeader("Access-Control-Allow-Origin", reqs.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Origin","*");

            //http://localhost:7849/

            //response.setHeader("Access-Control-Allow-Origin","http://127.0.0.1:8080");

            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT,RACE, OPTIONS");
            response.setHeader("Access-Control-Max-Age", "36000");
            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,Authorization");
            //response.setHeader("Access-Control-Allow-Headers", "*");

            //response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept,Authorization");

            //
            //response.setHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");

            chain.doFilter(req, res);

        }catch (Exception ex)
        {

            response.sendError(HttpServletResponse.SC_NON_AUTHORITATIVE_INFORMATION,"error");

            throw new ServletException(ex.getMessage());
        }

    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}
