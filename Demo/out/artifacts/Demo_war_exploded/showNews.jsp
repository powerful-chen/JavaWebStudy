<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/4/8
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="entity.News" %>
<%--<%--%>
<%--    News news = null;--%>
<%--    news = (News) request.getAttribute("news");--%>
<%--%>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>新闻首页</title>
</head>
<body>
<jsp:useBean id="news" class="entity.News" scope="request"></jsp:useBean>
<tr>
    新闻标题:&nbsp;<td><jsp:getProperty name="news" property="title"/></td>
</tr>
<br>
<tr>
    新闻类型:&nbsp;<td><jsp:getProperty name="news" property="newsType"/></td>
</tr>
<br>
<tr>
    新闻来源:&nbsp;<td><jsp:getProperty name="news" property="froms"/></td>
</tr>
<br>
<tr>
    发表时间:&nbsp;<td><jsp:getProperty name="news" property="publishTime"/></td>
</tr>
<br>
<tr>
    新闻内容:&nbsp;<td><jsp:getProperty name="news" property="content"/></td>
</tr>
<br>
</body>
</html>
