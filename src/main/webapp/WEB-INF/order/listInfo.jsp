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
			<th>出发地</th>
			<th>到达地</th>
			<th>出发时间</th>
			<th>到达时间</th>
			<th>用户姓名</th>
			<th>用户性别</th>
			<th>价格</th>
			<th>座位</th>
		</tr>
			<tr>
				<td>${lists.orderId}</td>
				<td>${lists.orderName }</td>
				<td>${lists.orderIdcard }</td>
				<td>${lists.orderTime }</td>
				<td>${lists.flightFrom }</td>
				<td>${lists.flightTo }</td>
				<td>${lists.flightFromTime }</td>
				<td>${lists.flightToTime }</td>
				<td>${lists.userName }</td>
				<td>${lists.userAge }</td>
				<td>${lists.moneyHeadPrice }</td>
				<td>${zuo }</td>

					
				
			</tr>
	</table>
		<a href="/aviation/order/lists">返回</a>
	</div>
</body>

</html>
