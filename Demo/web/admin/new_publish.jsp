<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/14
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻发布</title>
    <script type="text/javascript" scr="../fckeditor/fckeditor.js"></script>
</head>
<body>

<script type="text/javascript">
    function newsCheck() {
        if (document.newform.title.value == "") {
            alert("未填写新闻标题");
            return false;
        }
        if (document.newform.froms.value == "") {
            alert("未填写新闻来源");
            return false;
        }
        if (document.newform.publishTime.value == "") {
            alert("未填写新闻内容");
            return false;
        }
        return true;
    }
</script>

<jsp:include page="safe.jsp"></jsp:include>
<form method="post" action="PublishControl" name="newform" onsubmit="return newsCheck();">
    <center><b>发布新闻</b></center>
    新闻标题：<input type="text" name="title" size="60"/><br/>
    新闻类型：<select name="newsType" size="1">
    <option value="11">互联网</option>
    <option value="12">操作系统</option>
    <option value="13">java</option>
    <option value="14">数据库</option>
</select><br/>
    新闻来源：<input type="text" name="froms"/><br/>
    发表时间：<input type="text" name="publishTime"/><br/>
    新闻内容：<textarea name="content" cols="75" rows="20"></textarea><br/>
    <script type="text/javascript">
        var oFCKeditor = new FCKeditor('content');
        oFCKeditor.BasePath = "../fokeditor/";
        oFCKeditor.Height = 350;
        oFCKeditor.ToolbarSet = "Default";
        oFCKeditor.ReplaceTextarea();
    </script>
    <center><input type="submit" name="Submit" value="发布"></center>
</form>
</body>
</html>
