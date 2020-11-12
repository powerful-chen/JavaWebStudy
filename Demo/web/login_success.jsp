<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/28
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<%
    String loginUser = "";
    if (session.getAttribute("loginUser") != null) {
        loginUser = session.getAttribute("loginUser").toString();
    }
%>
<h1>欢迎<%=loginUser%>,登录成功</h1>
</body>
</html>
