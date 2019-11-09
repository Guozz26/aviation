<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.entity.po.AviationFlight;"%>

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
	<h3 align="center">新增航班计划</h3>
	<hr color="red">
	<div class="container" align="center">
		<form>	
			<div class="center">
			  <div class="form-group b">
				    <label for="exampleInputEmail1">出发地</label>
				    <input type="text" class="form-control a" id="" placeholder="出发地">
			  </div>
		      <div class="form-group b" >
				    <label for="exampleInputEmail1">出发时间</label>
				    <input type="date" class="form-control a" id="" >
			  </div>
			  <div class="form-group b">
				    <label for="exampleInputEmail1">目的地</label>
				    <input type="text" class="form-control a " id="" placeholder="目的地">
			  </div>
			   <div class="form-group b" >
				    <label for="exampleInputEmail1">到达时间</label>
				    <input type="date" class="form-control a" id="">
			    </div>
				    <div class="form-group" style="margin-left:-500px;">
				    	<label for="exampleInputPassword1">飞机型号</label>
				    	<input type="text" class="form-control a" id="">
		  			</div>


				    <div class="form-group b"  >
				    	<label for="exampleInputPassword1">头等舱价格</label>
				    	<input type="text" class="form-control a " id="">
		  			</div>
		  			  <div class="form-group b "  >
				    	<label for="exampleInputPassword1">经济舱价格</label>
				    	<input type="text" class="form-control a " id="">
		  			</div>
				</div>
			  <div >
			  	<button type="submit" class="btn btn-default">Submit</button>
			  </div>
		</form>
	</div>
</body>
</html>