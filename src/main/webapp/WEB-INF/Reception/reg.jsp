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
                    u_name: {
                        required: true,
                        minlength: 2,
                        remote:"ajax/selectName.jsp"
                    },
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
                    u_name: {
                        required: "请输入用户名",
                        minlength: "用户名必需由两个字母组成",
                        remote: "用户名已存在"
                    },
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
    <h3 class="head">注册</h3>
    <form action="/aviation/reception/reg/succer" method="post" id="formcon">
        <div class="form-group">
            <label for="u_name">用户名</label>
            <input type="text" class="form-control" id="u_name" placeholder="请输入用户名" name="name">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" placeholder="请输入密码" name = "password">
        </div>
        <div class="form-group">
            <label for="password2">再次确认密码</label>
            <input type="password" class="form-control" id="password2" placeholder="再次确认密码" name="password2">
        </div>

        <button type="submit" class="btn btn-default button">注册</button>
    </form>
    <div class="click">
        已有账号，请点击
        <a href = "sgin">这里</a>

    </div>
</div>


</body>
</html>