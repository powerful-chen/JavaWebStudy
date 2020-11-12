package com.chen.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName EncodingFilter
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/29 17:25
 */
public class EncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
