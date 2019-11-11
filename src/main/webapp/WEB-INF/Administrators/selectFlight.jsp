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
<body>
	<h3 align="center">航班查询</h3>
	<hr color="red">
	<div class="container" align="center">
		<table class="table table-striped">
			<form action="selectFlight/goinfo" method="get">


				<div class="form-group">
					<label for="">出发地</label> <input type="text" class="form-control"
						id="" placeholder="请输入出发地" name="from">
				</div>
				<div class="form-group">
					<label for="">目的地</label> <input type="text" class="form-control"
						id="" placeholder="请输入目的地" name="to">
				</div>

				<div>
					出发时间<input type="date" class="form-control" name="time"> <input
						type="hidden" name="pageNo" value="1"> <input
						type="hidden" name="pageSize" value="5">
				</div>

				<button type="submit" class="btn btn-default" value>查询</button>
				<div>
			</form>
		</table>
	</div>
</body>
</html>