<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div style="width: 230px;margin: 15px auto 0;">
    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/modify" name="myForm">
        <input type="hidden" class="form-control" id="id" placeholder="Username" style="width: 200px;" name="id" value="${user.id}">
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label"><b>Username</b></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEmail3" placeholder="Username" style="width: 200px;" name="name" value="${user.name}">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"><b>Password</b></label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password" style="width: 200px;" name="password" value="${user.password}">
            </div>
        </div>
        <div class="form-group">
            <label for="age" class="col-sm-2 control-label"><b>Age</b></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" placeholder="age" style="width: 200px;" name="age" value="${user.age}">
            </div>
        </div>
        <div class="form-group">
            <label for="birthday" class="col-sm-2 control-label"><b>Birthday</b></label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="birthday" placeholder="birthday" style="width: 200px;" name="birthday" value="<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd" />">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success" id="btn_regist">Moify</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
