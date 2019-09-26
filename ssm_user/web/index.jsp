<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <%--<script>
        $(function () {
           $("#btn_regist").click(function () {
               $.ajax({
                  type:"post",
                   data:{}
                  url:"${pageContext.request.contextPath}/listuser",
                   success:function (result) {
                       alert("ok")
                   },
               });
           });
        });
    </script>--%>
</head>
<body>
    <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/add" name="myForm" style="width: 30%;margin: 15px auto 0;">
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label"><b>Username</b></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEmail3" placeholder="Username" name="name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"><b>Password</b></label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="password">
            </div>
        </div>
        <div class="form-group">
            <label for="age" class="col-sm-2 control-label"><b>Age</b></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" placeholder="age" name="age">
            </div>
        </div>
        <div class="form-group">
            <label for="birthday" class="col-sm-2 control-label"><b>Birthday</b></label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="birthday" placeholder="birthday" name="birthday">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success" id="btn_regist">Regist</button>
            </div>
        </div>
    </form>
</body>
</html>
