<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>

<!DOCTYPE html>
<html lang="zxx">

<head>
	<title>欢迎搭乘澳大利亚广受欢迎的航空公司</title>

	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="" />
	<!--JS页面-->

	<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">

	<link rel="stylesheet" href="/aviation/assets/css/style2.css" type="text/css" media="all" />


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Web-Fonts -->
	<link href="http://fonts.googleapis.com/css?family=Poiret+One&amp;subset=cyrillic,latin-ext" rel="stylesheet">
	<link href="http://fonts.googleapis.com/css?family=Mada:200,300,400,500,600,700,900&amp;subset=arabic" rel="stylesheet">
	<!-- //轮播图 -->

	<link rel="stylesheet" type="text/css" href="/aviation/assets/css/biubiubiu.css" />
	<script type="text/javascript" src="/aviation/assets/js/jquery.js"></script>

</head>

<body>
<!--头部 -->
    <div class="top">
	   <div class="slw-top-1">
		   <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
	   </div>
	   <div class="slw-top-2"></div>
	   <div class="slw-top-3">
		   <a href="">注册</a>
		   <a href="">登录</a>
		   <a href="">个人中心</a>
	   </div>


   </div>

	 <!-- 轮播图+航班信息 -->
	<div class="web-box" style="position: relative;">
		<!-- 轮播图页面 -->
	<div >
		<div id="wowslider-container1">
		<div class="ws_images" style="position: relative" ><ul>
			<li><img src="/aviation/assets/images/1.png" alt="1" title="1" id="wows1_0"></li>
			<li><img src="/aviation/assets/images/2.png" alt="2" title="2" id="wows1_1"></li>
			<li><a href="#"><img src="/aviation/assets/images/3.png" alt="bootstrap carousel" title="3" id="wows1_2"></a></li>
		
		</ul></div>
		
		</div>
		<script type="text/javascript" src="/aviation/assets/js/wowslider.js"></script>
		<script type="text/javascript" src="/aviation/assets/js/script.js"></script>
		
		
			</div>
			 <!-- 航班搜索 -->
			<div>
				<div class="slw-aa-1" style="position: absolute;z-index: 100;top: 50px;">
					<div class="slw-aa-2">
						<div class="slw-aa-3">行&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
							程&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp预&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp定
							</div>
					</div>
					<from action="" method="post">
						<div class="slw-aa-4">
							<a href="">机票</a>
							<div class="slw-aa-4-1">
								<input class="slw-aa-4-2" type="radio" name="pay" value="0" ><span class="slw-aa-4-3">使用现金、积分或混合支付</span>
									&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								<input class="slw-aa-4-2" type="radio" name="pay" value="1"><span class="slw-aa-4-3">扫码支付</span>
							</div>
							<div class=slw-aa-5 style="color: white;font-size:25px;position: relative; top:60px;left:20px"> 出发地:</div>
							<div class="input-group input-group-lg">
									<span style="width:50px;position: relative; top:60px;left:20px"  class="input-group-addon" id="sizing-addon1">出发地</span>
									<input  style="width:350px; position: relative; top:60px;left:20px" type="text" class="form-control" placeholder="Shanghai[pudong]  [上海][浦东]" aria-describedby="sizing-addon1">
							</div>
							<div class=slw-aa-5 style="color: white;font-size:25px;position: relative; left: 520px;top:-22px"> 目的地:</div>
							<div class="input-group input-group-lg">
								<span style="width:50px;position: relative;top:-22px;left: 520px"  class="input-group-addon" id="sizing-addon1">目的地</span>
								<input  style="width:350px; position: relative;top:-22px;left: 520px" type="text" class="form-control" placeholder="Adelaide[阿德莱德]" aria-describedby="sizing-addon1">
							</div>
							<div class="slw-aa-6">
								<div class="slw-aa-6-1">
									<span style="font-size: 22px;color: #FAFAFA">出发日期</span>
									<input  type="date" class="form-control" id="slw-aa-6-2" >
								</div>
							</div>
							<input type="submit"  onclick="hint()" class="btn btn-danger " id=slw-aa-6-3 value="搜索航班">
						</div>
					</from>
				</div>
			</div>
	</div>
<!--特价优惠-->
    <div class="slw-b">
		<div class="slw-bb-1">最新特惠机票出发地：
			<a href="">&nbspshanghai[PuDong][上海]</a>
		</div>
		<div class="slw-b-2">

			<div class="slw-bb-2-1">
				<div class="slw-c">Sydney[悉尼]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">1,500*</a>
				</div>
			</div>
			<div class="slw-bb-2-1">
				<div class="slw-c">Melbourne[墨尔本]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">960*</a>
				</div>
			</div>
			<div class="slw-bb-2-1">
				<div class="slw-c">Brisbane[布里斯班]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">930*</a>
				</div>
			</div>
			<div class="slw-bb-2-1">
				<div class="slw-c">Adelaide[阿德莱德]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">1200*</a>
				</div>
			</div>
			<div class="slw-bb-2-1">
				<div class="slw-c">Harort[霍巴特]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">2,350*</a>
				</div>
			</div>
			<div class="slw-bb-2-1">
				<div class="slw-c">Perth[帕斯]</div>
				<div class="slw-d">经济舱 来回从</div>
				<div class="slw-e">
					<div class="slw-f">￥</div>
					<a href="">1,100*</a>
				</div>
			</div>


		</div>
		<button type="button" class="btn btn-danger " id=slw-g>查看更多机票优惠信息</button>



	</div>
<div class="slw-h">
	<div class="slw-t">
		<img src="/aviation/assets/images/5.png" alt="">
	</div >
	<div class="slw-i">
		<a href="">承运条件</a>
		<a href="">联系人</a>
		<a href="">隐私与安全</a>
		<a href="">使用条款</a>
		<a href="">票价指南</a>
	</div>
	<div class="slw-z">© Qantas Airways Limited ABN 16 009 661 901</div>
</div>
</body>
<script>
	function hint() {
		alert("您好，查询之前需要去登录")
	}
</script>
</html>