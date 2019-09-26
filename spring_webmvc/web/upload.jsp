<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 8/28/2019
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../ssm_user/web/bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <script type="text/ja vascript" src="../../ssm_user/web/jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="../../ssm_user/web/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
        <input type="text" name="username"><br>
        <input type="file" value="文件" name="filename"><br><br>
        <button type="submit" class="btn btn-success">上传</button>
    </form>
</body>
</html>
