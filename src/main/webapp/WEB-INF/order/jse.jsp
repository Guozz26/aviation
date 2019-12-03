<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
 <link href="/aviation/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/aviation/assets/css/sig.css" rel="stylesheet">

    <script src="../js/jquery-1.10.2.min.js"></script>
    <script src="../js/jquery.validate.js"></script>
</head>
<body>
<div class="center-sig">
    <div class="slw-top-1">
        <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
    </div>
    <div>
        <h3 class="head" style="width: 200px;margin-left: 90px">用户信息填写</h3>
        <form  action="bbb" id="formcon">
            <div class="form-group">
                <label >用户名</label>
                <input type="text" class="form-control" placeholder="请输入用户名" name = "name">
            </div>
            <div class="form-group">

                <span>身份证号</span>
                <input type="text" class="form-control" placeholder="请输入身份证号" name = "idcard">
            </div>
            
            <label>
            		<input name="Fruit" type="radio" value="1" />经济舱 
					<input name="Fruit" type="radio" value="2" />头等舱</label> 
			
            <button type="submit" class="btn btn-default button">购买</button>
        </form>

    </div>
</div>

</body>
</html>