<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/7/30
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<%--jsp表达式
    作用：用来将程序的输出，输出到客户端
<%--变量或者表达式--%>
<%= new java.util.Date()%>
<br>
<hr>
<%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
        sum += i;
    }
    out.println(sum);
%>
<hr>
<%
    for (int i = 0; i < 5; i++) {


%>
<h1>HelloWorld <%= i%>
</h1>
<%
    }
%>
<hr>
<%!
    static {
        System.out.println("Loading Servlet");
    }

    private int globaVar = 0;

    public void chen() {
        System.out.println("进入了方法chen");
    }
%>

</body>
</html>
