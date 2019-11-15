
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>
<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../css/payments.css" rel="stylesheet">
    <title>Document</title>
</head>

<script language="javascript">
    function Tab(num)
    {
        var i;
        for(i=1;i<=4;i++)
        {
            if(i==num)
                document.getElementById("d"+i).style.display="block";
            else
                document.getElementById("d"+i).style.display="none";
        }
    }
</script>
<body>
<div class="bsg-top">
    <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="" width="200px"height="100%">
        <div class="bsg-top-right">
            <h3>首页</h3>
        </div>

</div>
<div class="bsg-zhong">
    <div class="bsg-zhong-zhong">
        <div class="bsg-zhong-1">
              <span style="font-size: 10px">订单金额</span><span style="color: orange">￥</span><span style="color: orange ;font-weight: bold;font-size: 30px" >290.00</span>
        </div>
              <div class="bsg-zhong-2">
                   <span>支付时间剩余</span><span>13.45</span><span>,超时订单可能会自动取消</span>

             </div>
    </div>
    <div class="bsg-zhong-bottom">
        <span >❗ 航班价格变动频繁，请在15分钟内完成支付以免耽误出行</span>
    </div>
    <div class="bsg-zhong-right">
        <div class="bsg-zhong-right-top">
            <h3>单程机票&nbsp;:&nbsp;&nbsp; <span>北京</span>&nbsp;-&nbsp;<span>太原</span></h3>
        </div >
        <div class="bsg-zhong-shang">
            <span>飞机</span>&nbsp;&nbsp;<span>首都国际机场T3</span><span>-</span><span>武宿国际机场T1</span>&nbsp;&nbsp;<span>出发时间：</span><span>2019-07-15 &nbsp;07:00:00</span>
        </br> <span>乘机人：</span><span>史路文</span>&nbsp;&nbsp;<span>乘机证件：身份证</span>&nbsp;&nbsp;<span>123456789123x</span>
        </div>
    </div>

</div>
<div class="bsg-Middle-4">
    <!--标题栏-->
    <div class="head" id="head">
        <ul>
            <li id="L1" onclick="Tab(1)"><a href="#">微信支付</a></li>
            <li id="L2" onclick="Tab(2)"><a href="#">支付宝支付</a></li>
        </ul>
    </div>
    <!--里面的内容-->
    <div id="d1">
        <ul>
            <li style="list-style: none">


                <img src="../imgs/weixing.png" alt=""width="200px"height="200px"style="margin: auto;margin-left: 350px">
            </li>

        </ul>
    </div>
    <!--未出行订单-->
    <div id="d2">
        <ul style="list-style: none">
            <li style="list-style: none">
                <img src="../imgs/zhifubao.png" alt=""width="200px"height="200px"style="margin: auto;margin-left: 350px">

            </li>
        </ul>
    </div>
</div>


</body>
</html>