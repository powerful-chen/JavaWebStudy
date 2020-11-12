<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/4/8
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username=(String)session.getAttribute("username");
    String loginState=(String) session.getAttribute("loginState");
    if (!"SUCCESS".equalsIgnoreCase(loginState)) {
        out.print("script type = 'text/javascript'");
        out.print("alert('你没有权限，请登录')；");
        out.print("location.href='../login/html';");
        out.print("</script>");
    }
%>

</body>
</html>
