package com.chen.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @ClassName CookieDemo01
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/7/28 21:24
 */
public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        //Cookie 服务器端给客户端获取
        Cookie[] cookies = req.getCookies();//这里返回数组，说明Cookie可能存在多个

        // 判断Cookie是否存在
        if (cookies != null) {
            //如果存在
            out.write("你上一次访问的时间是:");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];

                if ("lastLoginTime".equals(cookie.getName())) {
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }

        } else {
            out.write("这是你第一次访问的本站");
        }

        //服务给客户端响应一个 cookie
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");

        cookie.setMaxAge(24 * 60 * 60);

        resp.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
