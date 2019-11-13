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
	<h3 align="center"> 营业点信息 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">
		<tr>
			<th>营业点编号</th>
			<th>营业点所在城市</th>
			<th>营业点负责人</th>
			<th>tel</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${lists}" var="list">
			<tr>
				<td>${list.pointId}</td>
				<td>${list.pointCity }</td>
				<td>${list.managerName }</td>
				<td>${list.managerTel }</td>

				<td>
					<a href="lists/upPoint/${list.pointId}">修改营业点信息</a>
					<a href="lists/delPoint/${list.pointId}">删除该营业点</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>

	</div>
</body>

</html>
