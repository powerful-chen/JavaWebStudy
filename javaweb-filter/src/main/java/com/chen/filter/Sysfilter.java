package com.chen.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName Sysfilter
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/8/1 21:22
 */
public class Sysfilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        if (request.getSession().getAttribute("USER_SESSION") ==null){
            response.sendRedirect("/error.jsp");
        }


        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
