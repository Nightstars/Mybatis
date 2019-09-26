<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/23/2019
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <div style="width: 400px;margin: 0 auto;margin-top: 15px;">
        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/login2" name="myForm">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Username</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputEmail3" placeholder="Username" style="width: 200px;" name="username">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword3" placeholder="Password" style="width: 200px;" name="password">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-success">Sign in</button>
                    <a class="btn btn-info" href="${pageContext.request.contextPath}/login2?username=Tom&password=123456">Sign in</a>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
