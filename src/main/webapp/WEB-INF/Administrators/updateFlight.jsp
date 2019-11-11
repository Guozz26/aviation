<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.entity.*;"%>

<!DOCTYPE html>
<html>

<head>
<title>首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<style>
	.a{
		width:300px;
	}
	.b{
		float:left;
		margin-right:100px;
	}
	.center{
	
		width:800px;
		height:300px;
		margin:auto;

	}
</style>
<body>
	<h3 align="center">修改航班计划</h3>
	<hr color="red">
	<div class="container" align="center">
		<form action="updSuccer" method="get">	
			<input type="hidden" name = "flightId" value = "${FlightInfo.flightId}">
			<div class="center">
			  <div class="form-group b">
				    <label for="exampleInputEmail1">出发地</label>
				    <input type="text" class="form-control a" id="" placeholder="出发地" name="from" value="${FlightInfo.flightFrom}">
			  </div>
		      <div class="form-group b" >
				    <label for="exampleInputEmail1">出发时间</label>
				    <input type="datetime-local" class="form-control a" id="" name="fromTime"  pattern="yyyy-MM-dd HH:mm:ss" value="${FlightInfo.flightFromTime}">
			  </div>
			  <div class="form-group b">
				    <label for="exampleInputEmail1">目的地</label>
				    <input type="text" class="form-control a " id="" placeholder="目的地" name="to" value="${FlightInfo.flightTo}">
			  </div>
			   <div class="form-group b" >
				    <label for="exampleInputEmail1" >到达时间</label>
				    <input type="datetime-local" class="form-control a" id="" name="toTime" value="${FlightInfo.flightToTime}">
			    </div>
				    <div class="form-group" style="margin-left:-500px;">
				    	<label for="exampleInputPassword1">飞机型号</label>
				    	<input type="text" class="form-control a" id="" name="modelId" value="${FlightInfo.modelId}">
		  			</div>


				    <div class="form-group b"  >
				    	<label for="exampleInputPassword1">头等舱价格</label>
				    	<input type="text" class="form-control a " id="" name="moneyHeadPrice" value="${FlightInfo.moneyHeadPrice}">
		  			</div>
		  			  <div class="form-group b "  >
				    	<label for="exampleInputPassword1">经济舱价格</label>
				    	<input type="text" class="form-control a " id="" name="moneyBodyPrice" value="${FlightInfo.moneyBodyPrice}">
		  			</div>
				</div>
			  <div >
			  	<button type="submit" class="btn btn-default">Submit</button>
			  </div>
		</form>
	</div>
</body>
</html>