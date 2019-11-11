<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.entity.vo.FlightInfo;" %>

<!DOCTYPE html>
<html>
<head>
<title>首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
<link rel="stylesheet" href="/aviation/assets/css/Gzzinfo.css">
</head>
<style>
	body{
	background:#fff;}
</style>
<body>
	<h3 align="center"> 航班计划 </h3>
	<hr color="red">
	
	
	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>出发地</th>
			<th>目的地</th>
			<th>出发时间</th>
			<th>到达时间</th>
			<th>飞机型号</th>
			<th>经济舱剩余座位</th>
			<th>经济舱价格</th>
			<th>头等舱剩余座位</th>
			<th>头等舱价格</th>
		</tr>
		<c:forEach items="${lists}" var="lists">
			<tr>
				<td>${lists.flightId}</td>
				<td>${lists.flightFrom }</td>
				<td>${lists.flightTo }</td>
				<td>${lists.flightFromTime }</td>
				<td>${lists.flightToTime }</td>
				<td>${lists.modelName }</td>
				<td>${lists.flightHeadNum}</td>
				<td>${lists.moneyHeadPrice }</td>
				<td>${lists.flightBodyNum}</td>
				<td>${lists.moneyBodyPrice }</td>
			</tr>
				</c:forEach>
	</table> 
	<a href="/aviation/administrators/selectFlight">返回</a>
		
	
<%-- 	<div class="container" align="center">
		<c:forEach items="${lists}" var="lists">
			<div><p>航班编号</p>${lists.flightId}</div>
			<div><p>出发地</p>${lists.flightFrom }</div>
			<div><p>目的地</p>${lists.flightTo }</div>
			<div><p>出发时间</p>${lists.flightFromTime }</div>
			<div><p>到达时间</p>${lists.flightToTime }</div>
			<div><p>飞机型号</p>${lists.modelName }</div>
			<div><p>头等舱</p>${lists.modelHeadnum }</div>
			<div><p>价格</p>${lists.moneyHeadPrice }</div>
			<div><p>经济舱</p>${lists.modelBodynum }</div>
			<div><p>价格</p>${lists.moneyBodyPrice }</div>	
			<a href="delFlight/${lists.flightId}">删除航班</a>
			<a href="updateFlight/${lists.flightId}">修改航班信息</a>
			</c:forEach>
	</div> --%>
</body>
</html>