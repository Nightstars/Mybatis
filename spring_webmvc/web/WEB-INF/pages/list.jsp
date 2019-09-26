<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/23/2019
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h2>show the data from controler</h2>
<h2>information:${data}</h2>
<h2>information:${data1.username}</h2>
<h2>information:${data1.password}</h2>
<h2>
    multile users:<br>
    <c:forEach var="user" items="${data2}">
        ${user.username},${user.password}<br>
    </c:forEach>
</h2>
</body>
</html>
