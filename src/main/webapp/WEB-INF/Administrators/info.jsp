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
<body style="background:#fff;">
	<h3 align="center"> 航班计划 </h3>
	<hr color="red">
	<div class="container" align="center">
	<table class="table table-striped">
	<tr>
			<td><p>航班编号</p></td>
			<td><p>出发地</p></td>
			<td><p>目的地</p></td>
			<td><p>出发时间</p></td>
			<td><p>到达时间</p></td>
			<td><p>飞机型号</p></td>
			<td><p>头等舱</p></td>
			<td><p>价格</p></td>
			<td><p>经济舱</p></td>
			<td><p>价格</p></td>	
			
			
			</tr>
			
	<tr>
			<td>${lists.flightId}</td>
			<td>${lists.flightFrom }</td>
			<td>${lists.flightTo }</td>
			<td>${lists.flightFromTime }</td>
			<td>${lists.flightToTime }</td>
			<td>${lists.modelName }</td>
			<td>${lists.modelHeadnum }</td>
			<td>${lists.moneyHeadPrice }</td>
			<td>${lists.modelBodynum }</td>
			<td>${lists.moneyBodyPrice }</td>
	
			
	</tr>
		

		</table>
	</div>
	
	
		<div style="margin-left:600px;margin-top:100px">
				<a href="delFlight/${lists.flightId}">删除航班</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="updateFlight/${lists.flightId}">修改航班信息</a>
				
		
		
	</div>	
</body>
</html>