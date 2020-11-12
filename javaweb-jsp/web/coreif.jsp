<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/1
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>if测试</h4>
<hr>
<form action="coreif.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>

<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="管理员欢迎您"/>
</c:if>

<c:out value="${isAdmin}"/>

<hr>

<%
    ArrayList<String> people = new ArrayList<>();
    people.add(0, "张三");
    people.add(1, "李四");
    people.add(2, "王五");
    people.add(3, "赵六");
    people.add(4, "田六");
    request.setAttribute("list", people);
%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"/>
</c:forEach>

<hr>

<c:forEach var="people" items="${list}" begin="1" end="3" step="2">
    <c:out value="${people}"/>
</c:forEach>

</body>
</html>
