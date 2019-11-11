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
	<h3 align="center"> 航班计划 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">
		<tr>
			<th>订单编号</th>
			<th>买家姓名</th>
			<th>买家身份账号</th>
			<th>下单时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${lists}" var="list">
			<tr>
				<td>${list.orderId}</td>
				<td>${list.orderName }</td>
				<td>${list.orderIdcard }</td>
				<td>${list.orderTime }</td>

				<td>
					<a href="lists/listInfo/${list.orderId}">查看详细信息</a>
					<a href="lists/delOrder/${list.orderId}">删除订单</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>

	</div>
</body>

</html>
