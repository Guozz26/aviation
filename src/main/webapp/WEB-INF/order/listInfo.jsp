<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>
<%
	int role = Integer.parseInt(session.getAttribute("role").toString());
%>
<!DOCTYPE html>
<html>

<head>
<title>首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<body>
	<h3 align="center"> 订单详情信息 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">

		<tr>
			<th>订单id</th>
			<th>用户姓名</th>
			<th>购票时间</th>
			<th>买家身份号</th>
			<th>出发地</th>
			<th>到达地</th>
			<th>出发时间</th>
			<th>到达时间</th>
			<th>价格</th>
			<th>座位</th>
			<th>订单状态</th>
			<%
				if(role==2){
			%>
			<th>操作</th>
			<%
				}
			%>
			
		</tr>
			<tr>
				<td>${a.orderId}</td>
				<td>${a.orderUserName }</td>
				<td>${a.orderTime }</td>
				<td>${a.orderIdcard }</td>
				<td>${a.orderTimes }</td>
				<td>${a.orderTo }</td>
				<td>${a.orderFromTime }</td>
				<td>${a.orderFromTo }</td>
				<td>${a.orderMoney }</td>
				<td>${a.orderPrice}</td>
				
				<c:if test="${a.orderStatic==1}">
						<td>已退票</td>
				</c:if>
						<c:if test="${a.orderStatic==0}">
				
				<td>已购买</td>
				</c:if>
				<td> 
				
				<%
					if(role==2){
				%>
				
					<a href="/aviation/order/lists/changes//${a.orderId}" ><button type="submit" class="btn btn-default button">改签</button></a>
					<a href="/aviation/order/lists/duipiao/${a.orderId}"><button type="submit" class="btn btn-default button">退票</button></a>
				
				
				
				<%
					}
				%>
				 </td>		
				
			</tr>
		
	</table>
	
	
		<a href="/aviation/order/lists">返回</a>
	</div>
</body>

</html>
