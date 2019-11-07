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
</head>
<body>
	<h3 align="center"> 航班计划 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">
		<tr>
			<th>航班编号</th>
			<th>出发地</th>
			<th>目的地</th>
			<th>出发时间</th>
			<th>到达时间</th>
			<th>飞机型号</th>
			<th>头等舱</th>
			<th>价格</th>
			<th>经济舱</th>
			<th>价格</th>
			<th>操作</th>
		</tr>
			<tr>
				<td>${lists.flightId}</td>
				<td>${lists.flightFrom }</td>
				<td>${lists.flightTo }</td>
				<td>${lists.flightFromTime }</td>
				<td>${lists.flightToTime }</td>
				<td>${lists.modelName }</td>
				<td>${lists.modelHeadNum }</td>
				<td>${lists.moneyHeadPrice }</td>
				<td>${lists.modelBodyNum }</td>
				<td>${lists.moneyBodyPrice }</td>			
				<td>
					<a href="lists/info/${list.flightId}">删除航班</a>
					<a href="lists/info/${list.flightId}">修改航班信息</a>
				</td>				
			</tr>
	</table>
	</div>
</body>

</html>