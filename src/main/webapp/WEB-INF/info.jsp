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
<body>
	<h3 align="center"> 航班计划 </h3>
	<hr color="red">
	<div class="container" align="center">
	
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
			<a href="lists/info/${lists.flightId}">修改航班信息</a>
	</div>
</body>
</html>