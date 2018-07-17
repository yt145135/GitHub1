<%--
  Created by IntelliJ IDEA.
  User: yt145
  Date: 2018/5/24
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多文件上传</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="/batch/upload">
    <p>文件1：<input type="text" name="id" /></p>
    <p>文件2：<input type="text" name="name" /></p>
    <p>文件3：<input type="file" name="file" /></p>
    <p><input type="submit" value="上传" /></p>

</form>
</body>
</html>
