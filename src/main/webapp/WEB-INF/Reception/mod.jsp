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
    <script src="/aviation/assets/js/jquery-1.10.2.min.js"></script>
    <script src="/aviation/assets/js/jquery.validate.js"></script>

    <script>
        $().ready(function() {
            //检测输入：
            $("#formcon").validate({


                rules: {

                    password: {
                        required: true,
                        minlength: 5
                    },
                    password2: {
                        required: true,
                        minlength: 5,
                        equalTo: "#password"
                    }

                },
                messages: {
                    password: {
                        required: "请输入密码",
                        minlength: "密码长度不能小于 5 个字母"
                    },
                    password2: {
                        required: "请输入密码",
                        minlength: "密码长度不能小于 5 个字母",
                        equalTo: "两次密码输入不一致"
                    }
                }

            })
        });

    </script>

</head>
<body>
<div class="slw-top-1">
    <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
</div>
<div class="center">
    <h3 class="head" style="width:400px ;margin-left: 100px">修改信息</h3>
    <form  mothed="post" id="formcon">
<div class="form-group">
          性别：
    男<input type="radio" name="role" value="2" >
    女<input type="radio" name="role" value="3" >
</div>
        <div class="form-group">
            年龄：<input type="date"  >

        </div>

        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" placeholder="请输入密码" name = "password">
        </div>
        <div class="form-group">
            <label for="password2">再次确认密码</label>
            <input type="password" class="form-control" id="password2" placeholder="再次确认密码" name="password2">
        </div>

        <button type="submit" class="btn btn-default button">确认修改</button>
    </form>
    <div class="click">
        放弃修改，请点击
        <a href = "core.html">这里</a>

    </div>
</div>


</body>
</html>