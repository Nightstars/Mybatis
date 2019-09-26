<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jQuery/jQuery3.4.1.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $("#btn_signin").click(function () {
                $.get(
                    "${pageContext.request.contextPath}/ajax4?id=150",
                    $("form[name=myForm]").serialize(),
                    function (result) {
                       $.each(result,function (index,value) {
                           $("#p1").append(
                               value.username+"&nbsp;&nbsp;&nbsp;&nbsp;"+value.password+"<br>"
                           );
                       });
                    },
                    "json"
                );
            });
        });
    </script>
</head>
<body>
<%--<button class="btn btn-success" style="width: 100px;margin-top: 12px;" id="btn_test">GetInfo</button>--%>
<div style="width: 400px;margin: 0 auto;margin-top: 15px;">
    <form class="form-horizontal" name="myForm">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">Username</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="username" placeholder="Username" style="width: 200px;" name="username">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" placeholder="Password" style="width: 200px;" name="password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="button" class="btn btn-success" id="btn_signin">Sign in</button>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/login2?username=Tom&password=123456">Sign in</a>
            </div>
        </div>
    </form>
</div>
<p id="p1"></p>
</body>
</html>
