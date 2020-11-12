<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/9
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                // console.log("1111");
                $.post("${pageContext.request.contextPath}/a2", function (data) {
                    // console.log(data);
                    var html = "";

                    for (let i = 0; i < data.length; i++) {
                        $("#content").html(
                            html += "<tr>" +
                                "<td>" + data[i].age + "</td>" +
                                "<td>" + data[i].name + "</td>" +
                                "<td>" + data[i].sex + "</td>" +
                                "<tr>"
                        )
                    }
                    $("#content").html(html);
                });
            })
        });
    </script>
</head>
<body>
<input type="button" id="btn" value="加载数据">
<table>
    <tr>
        <td>年龄</td>
        <td>姓名</td>
        <td>性别</td>
    </tr>
    <tbody id="content">
    <!--后端加载数据-->
    </tbody>
</table>

</body>
</html>
