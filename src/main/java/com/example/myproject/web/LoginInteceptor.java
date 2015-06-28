package com.example.myproject.web;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInteceptor implements HandlerInterceptor {

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object arg2, Exception arg3)
            throws Exception {

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object arg2, ModelAndView arg3) throws Exception {

    }

    /**
     * 拦截器
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object arg2) throws Exception {
        String url = request.getServletPath();
        System.out.println("===============url=" + url + "===============");
        if (url.endsWith("login") || url.endsWith("chkcode.jpg")) {
            return true;
        }

        return true;
    }

}