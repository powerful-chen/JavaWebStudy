package com.chen.config;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginInterceptor
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/11/11 15:04
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        //放行：判断什么情况下登录
        //登录页面会被放行
        if (request.getRequestURI().contains("goLogin")) {
            return true;
        }
        //说明在进行登录
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        //第一次登录，也是没有session的
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
