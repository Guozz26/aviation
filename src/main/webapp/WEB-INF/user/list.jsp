<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>

<!DOCTYPE html>
<html>

<head>
<title>首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<body>
	<h3 align="center"> 用户信息 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">
		<tr>
			<th>用户编号</th>
			<th>用户姓名</th>
			<th>用户密码</th>
			<th>性别</th>
			<th>出生日期</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${lists}" var="list">
			<tr>
				<td>${list.userId}</td>
				<td>${list.userName }</td>
				<td>${list.userPwd }</td>
				<td>${list.userSex }</td>
				<td>${list.userAge }</td>

				<td>
					<a href="lists/delUser/${list.userId}">拉入黑名单</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>

	</div>
</body>

</html>
