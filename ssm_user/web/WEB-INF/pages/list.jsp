<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 9/24/2019
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
    <script type="text/javascript" src="jQuery/jQuery3.4.1.js"></script>
    <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="js/my.js"></script>
</head>
<body onload="test();">
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
            <td>${idxStatus.index+1}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
<%--            <td>${user.birthday}</td>--%>
            <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd" /></td>
            <td>
                <a href="${pageContext.request.contextPath}/preview?id=${user.id}" class="btn btn-warning btn-sm" style="height:32px;">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/delete?id=${user.id}" class="btn btn-danger btn-sm" onclick="return window.confirm('这条记录将被删除且不可恢复，确认删除吗？')" style="height:32px;">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<center>
    <a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-success" style="width:300px;">add User</a>
</center>
<center>
    <nav aria-label="Page navigation">
    <ul class="pagination">
        <li ${users.getPageNum()==1?"class='disabled'":""}>
            <a href="${pageContext.request.contextPath}/list?pageNum=1&pageSize=${users.getPageSize()}" aria-label="Previous">
                <span aria-hidden="true">first</span>
            </a>
        </li>
        <li ${users.getPageNum()==1?"class='disabled'":""}>
            <a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()-1}&pageSize=${users.getPageSize()}" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
            </a>
        </li>
        <li>
            <a href="#">
                共${users.getTotal()}条记录
            </a>
        </li>
        <li>
            <a href="#">
                共${users.getPages()}页<br>
            </a>
        </li>
        <li  style="${users.getPageNum()-2<1?"display:none":""}"><a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()-2}&pageSize=${users.getPageSize()}">${users.getPageNum()-2}</a></li>
        <li style="${users.getPageNum()-1<1?"display:none":""}"><a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()-1}&pageSize=${users.getPageSize()}">${users.getPageNum()-1}</a></li>
        <li class="active"><a href="#">${users.getPageNum()}</a></li>
        <li style="${users.getPageNum()+1>users.getPages()?"display:none":""}"><a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()+1}&pageSize=${users.getPageSize()}">${users.getPageNum()+1}</a></li>
        <li style="${users.getPageNum()+2>users.getPages()?"display:none":""}"><a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()+2}&pageSize=${users.getPageSize()}">${users.getPageNum()+2}</a></li>
        <li>
            <span>
                每页显示&nbsp;&nbsp;<select name="pageSize" id="pageSize">
                <option value="5" name="5" ${users.getPageSize()==5?"selected":""}>5</option>
                <option value="10" name="10" ${users.getPageSize()==10?"selected":""}>10</option>
                <option value="15" name="15" ${users.getPageSize()==15?"selected":""}>15</option>
                <option value="20" name="20" ${users.getPageSize()==20?"selected":""}>20</option>
                <option value="25" name="25" ${users.getPageSize()==25?"selected":""}>25</option>
                <option value="30" name="30" ${users.getPageSize()==30?"selected":""}>30</option>
            </select>
            </span>
        </li>
        <li>
            <span >
                跳转&nbsp;&nbsp;<input type="text" name="pages" style="width:30px;height:18px;">
            </span>
        </li>
        <li>
            <a href="#">
                go
            </a>
        </li>
        <li class="${users.getPageNum()==users.getPages()?"disabled":""}">
            <a href="${pageContext.request.contextPath}/list?pageNum=${users.getPageNum()+1}&pageSize=${users.getPageSize()}" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
            </a>
        </li>
        <li class="${users.getPageNum()==users.getPages()?"disabled":""}">
            <a href="${pageContext.request.contextPath}/list?pageNum=${users.getPages()}&pageSize=${users.getPageSize()}" aria-label="Previous">
                <span aria-hidden="true">end</span>
            </a>
        </li>
    </ul>
    </nav>
</center>
</body>
</html>
