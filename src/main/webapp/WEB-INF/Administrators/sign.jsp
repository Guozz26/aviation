<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<body>
<div class="center-sig">
	<div>
	<h3 class="head">登录</h3>
		<form  action="sigCon.jsp" mothed="get">
		  <div class="form-group">
		    <label for="exampleInputEmail1">用户名</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="请输入用户名" name = "u_name">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">密码</label>
		    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码" name = "password">
		  </div>
		  <button type="submit" class="btn btn-default button">登录</button>
		</form>
		<div class = "click">
		没有账号？点击
		<a href = "reg.jsp">这里</a>
		
		</div>
	</div>		
</div>

</body>
</html>