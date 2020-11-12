<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/12
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("username");
    String loginState = (String) session.getAttribute("loginState");

    if (!"SUCCESS".equalsIgnoreCase(loginState)) {
        response.sendRedirect("../login.html");
    }
%>

</body>
</html>
