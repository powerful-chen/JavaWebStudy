package com.chen.servlet;

import com.chen.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @ClassName SessionDemo01
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/7/29 10:57
 */
public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到session
        HttpSession session = req.getSession();

        //给session中存东西
        session.setAttribute("name",new Person("小陈",18));

        //获取sessionId
        String sessionId = session.getId();

        //判断session是不是新创建
        if (session.isNew()) {
            resp.getWriter().write("session创建成功，ID：" + sessionId);
        } else {
            resp.getWriter().write("session已经在服务器存在了，ID：" + sessionId);
        }
        //session 创建的时候做了什么事情；
        //Cookie cookie = new Cookie("JSESSIONID", sessionId);
        //resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
