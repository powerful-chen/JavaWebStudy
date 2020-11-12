<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/1
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    pageContext.setAttribute("name1", "小陈1号");//保存的数据只在一个页面中有效
    request.setAttribute("name2", "小陈2号");//保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3", "小陈3号");//保存的数据只在一次会话中有效，从打开浏览器到关闭浏览器
    application.setAttribute("name4", "小陈4号");//保存的数据只在服务器中有效，从打开服务器到关闭服务器

%>
<%
    //从pageContext取出，我们通过寻找的方式来
    //从底层到高层（作用域）
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");//不存在

%>
<%--使用EL表达式取出 ${}--%>
<h1>取出的值为</h1>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=name5%>
</h3>//输出为null
<h3>${name5}</h3>//页面不输出

</body>
</html>
