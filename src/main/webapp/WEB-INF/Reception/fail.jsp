
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
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/sig.css" rel="stylesheet">
    <script>
        window.onload =function () {
            var i =3
            var t = setInterval(function () {
                i--
                if(i==0){
                    clearInterval(t)
                    location.href="/aviation/reception/index"
                }
            },1000)
        }
    </script>
    <style>
        .chart img{
            margin-left: 140px;
            margin-top: 50px;
        }
        .gun-1{
            margin-left: 100px;
            margin-top: 30px;
        }
    </style>
</head>
<body>
<div class="center-sig">
    <div class="slw-top-1">
        <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
    </div>
    <div class="box">
        <div class="chart">
            <img src="../imgs/ku.png" alt=""width="60px"height="60px">

        </div>
        <div class="gun-1">
            <div class="top"><h4>很遗憾,操作失败！</h4></div>

        </div>
    </div>
</div>



</body>
</html>