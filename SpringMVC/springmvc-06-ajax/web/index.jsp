<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/2
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
        function a1() {
            $.post({
                url: "${pageContext.request.contextPath}/a1",
                data: {"name": $("#username").val()},
                success: function (data) {
                    alert(data);
                }
            })
        }
    </script>

</head>
<body>
<%--失去焦点的时候，发起一个请求（携带信息）到后台--%>
用户名：<input type="text" id="username" onblur="a1()">
</body>
</html>
