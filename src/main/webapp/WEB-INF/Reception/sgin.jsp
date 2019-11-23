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

	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <script src="/aviation/assets/js/jquery.validate.js"></script>

     <script>
        $().ready(function() {
            //检测输入：
            $("#formcon").validate({

                rules: {
                    u_name: {
                        required: true,
                        minlength: 2
                    },
                    password: {
                        required: true,
                        minlength: 5
                    }
                },
                messages: {
                    u_name: {
                        required: "请输入用户名",
                        minlength: "用户名必需由两个字母组成",
                        remote: "用户名已存在"
                    },
                    password: {
                        required: "请输入密码",
                        minlength: "密码长度不能小于 5 个字母"
                    }
                }

            })
        });

    </script> 
</head>
<body>
<div >

</div>
<div class="center-sig">
    <div class="slw-top-1">
        <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
    </div>
    <div>
        <h3 class="head">登录</h3>
        <form  action="index" method="post" id="formcon">
            <div class="form-group">
                <label for="exampleInputEmail1">用户名</label>
                <input type="text" class="form-control" id="exampleInputEmail1" placeholder="请输入用户名" name = "name">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码" name = "password">
            </div>
	          	  用户<input type="radio" name="role" value="1" checked="checked">
	           	 营业员<input type="radio" name="role" value="2" >
	           	 管理员<input type="radio" name="role" value="3" >
	            Boss<input type="radio" name="role" value="4" >
            <input type="submit" class="btn btn-default button" value="登录">

        </form>
        <div class = "click">
            没有账号？点击
            <a href = "reg">这里</a>

        </div>
    </div>
</div>




</body>
</html>