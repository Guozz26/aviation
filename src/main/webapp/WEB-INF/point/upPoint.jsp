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
	<h3 align="center">新增营业点</h3>
	<hr color="red">
	<div class="container" align="center">
		<form action="update/succer" method="get">	
			<div class="center">
			<input type="hidden" name="pointId" value="${lists.pointId }">
			  <div class="form-group b">
				    <label for="exampleInputEmail1">所在城市</label>
				    <input type="text" class="form-control a" id="" placeholder="city" name="pointCity" value="${lists.pointCity}">
			  </div>
			  <input type="hidden" value="${lists.managerId}" name="managerId">
		      <div class="form-group b" >
				    <label for="exampleInputEmail1">负责人名字</label>
				    <input type="text" class="form-control a" id="" name="managerName" value="${lists.managerName}">
			  </div>
			  <div class="form-group b">
				    性别<Select name="managerSex" class="form-control a" >
						<option selected = “selected” value="${lists.managerSex}">男</option>
						<option>女</option>
					</select>
			  </div>
			
				    <div class="form-group" style="margin-left:-500px;">
				    	<label for="exampleInputPassword1">电话号码</label>
				    	<input type="text" class="form-control a" id="" name="managerTel" value="${lists.managerTel}">
		  			</div>


				    <div class="form-group b"  >
				    	<label for="exampleInputPassword1">密码</label>
				    	<input type="password" class="form-control a " id="" name="managerPwd">
		  			</div>
		  			  
				</div>
			  <div >
			  	<button type="submit" class="btn btn-default">Submit</button>
			  </div>
		</form>
	</div>
</body>
</html>