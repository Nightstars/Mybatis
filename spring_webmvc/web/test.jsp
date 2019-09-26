<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="myform" method="post" action="${pageContext.request.contextPath}/user/1001">
    <input type="hidden" name="_method" value="delete">
    username:<input type="text" name="test">
    <button type="submit">test</button>
</form>
</body>
</html>
