<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
<center><h2>welcome this is list page!</h2></center>
<table class="table table-striped table-hover" style="width:60%;text-align:center;" align="center">
    <thead>
        <tr>
            <td><b>序号</b></td>
            <td><b>姓名</b></td>
            <td><b>密码</b></td>
            <td><b>年龄</b></td>
            <td><b>生日</b></td>
            <td><b>操作</b></td>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}" varStatus="idxStatus">
        <tr>
<%--            <td>${idxStatus.index}</td>--%>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td>${user.birthday}</td>
            <td>
                <a href="${pageContext.request.contextPath}/preview?id=${user.id}" class="btn btn-warning" >修改</a>
                <a href="${pageContext.request.contextPath}/delete?id=${user.id}" class="btn btn-danger" onclick="return window.confirm('这条记录将被删除且不可恢复，确认删除吗？')">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
