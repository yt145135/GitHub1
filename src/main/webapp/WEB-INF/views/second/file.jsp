<%--
  Created by IntelliJ IDEA.
  User: yt145
  Date: 2018/5/24
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="/upload" method="POST" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="Upload"/>
    <a href="http://localhost:8089/testDownload">下载</a>
</form>
</body>
</html>
