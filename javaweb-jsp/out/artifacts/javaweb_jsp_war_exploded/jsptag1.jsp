<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/1
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>1</h1>
<jsp:forward page="/jsptag2.jsp">
    <jsp:param name="name" value="xiaochen"/>
    <jsp:param name="age" value="12"/>
</jsp:forward>
</body>
</html>
