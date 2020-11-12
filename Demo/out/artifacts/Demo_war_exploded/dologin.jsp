<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/28
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录检查</title>
</head>
<body>
<%
    String username = "";
    String password = "";

    username = request.getParameter("username");
    password = request.getParameter("password");

    //如果用户名和密码都是admin，则登录成功
    if ("admin".equals(username) && "123456".equals(password)) {
        session.setAttribute("loginUser", username);
        request.getRequestDispatcher("login_success.jsp").forward(request, response);
    } else {
        response.sendRedirect("login_failure.jsp");
    }
%>
</body>
</html>
