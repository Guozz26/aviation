<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="/aviation/assets/css/addpay.css">
 <link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<body>

<div class="top">
    <div class="slw-top-1">
        <a href="http://localhost:63342/html/Aviation/index.html?_ijt=q78nlf6hjjcfnpo77he5u2q2cq">
            <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="index.html">
        </a>
    </div>
    <div class="slw-top-2"></div>
    <div class="slw-top-3">

    </div>
</div>
   <!--乘客信息填写-->
   <div class="slw-one" >
       <img src="https://newstatic.hnair.com/hainanair/ibe/theme/hainan/images/loading.jpg" alt="">
       <div class="slw-one-1">
           <div class="slw-one-2">
               <div class="slw-one-2-img"><img src="/aviation/assets/images/pay1.png" alt=""></div>
               <span class="slw-one-22">您预定的产品不可使用港澳通行证预定</span>
           </div>
           <div class="slw-one-3">
               <div class="slw-one-3-img"><img src="/aviation/assets/images/pay1.png" alt=""></div>
               <span class="slw-one-33">该航班预计在扣款成功后20分钟内完成出票，保证出行</span>
       </div>
   

   </div>
   </div>
	<form action="/aviation/reception/payMents" method="post">
   <div class="slw-two">

        <div class="slw-two-1">
      <input type="text" placeholder="姓名，请与登记证件姓名保持一致" class="slw-two-2"  name="name">
        </div>
       <div class="slw-two-3">
           <div class="slw-two-5">
               <div class="slw-two-6">身份证</div>
           </div>
           <input type="text" name="idcard" placeholder="登记证件身份证" class="slw-two-4" >
       </div>

  <!--      <div class="slw-two-7">
           <div class="slw-two-8">
               <div class="slw-two-9">中国区号86</div>
           </div>
           <input type="text" placeholder="乘机人手机号码" class="slw-two-10"   >
       </div> -->
   </div>
<!--    <div class="slw-three">
       <button class="slw-three-1">+添加乘客</button>
   </div> -->
   <div class="slw-three-2">
       <input type="submit" class="slw-three-3" value="下一步">
   </div>
  
<!--飞机信息-->
  <div class="slw-five-1">
      <!--第一行-->
        <div class="slw-five-2">
            <div class="slw-five-2-1">
                <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAYAAABWdVznAAAAxUlEQVR4AWOAgf///zO2zV2T2jpnzYmW2as/gzCIDRIDyTEgg9bFayWBCvYC8X8ceC9IDdxkZMWtc1Y/BeKTUPwUWRPYJpCVyKYBnbF+1ar/zCAMYiPLgdQygNwJF0TY4tw+b60LujhILQPUgwiJOWver1p1lQ2EW2ev/oCm6TNCA8KU+bDAALHRNWA4qX3OOg+4hrmrPdGdhOFpoNuVYBq6FqxXRvc0tmC93bJwszQIg9jowYoacQiPPwB6+CG2iCM5aQAAe2tJxI97uikAAAAASUVORK5CYII=" alt="">
                供应商
            </div>
            <div class="slw-five-2-2">
                     <span class="slw-five-2-3">&nbsp&nbsp</span>
               
                     <span class="slw-five-2-3" name="flightFrom">${lists.flightFrom}&nbsp&nbsp</span>
                      <span class="slw-five-2-3">→&nbsp&nbsp</span>
                     <span class="slw-five-2-3" name="flightto">${lists.flightTo}&nbsp&nbsp</span>
            </div>
            <div class="slw-five-2-4">
                <img src="//pic.c-ctrip.com/flight_intl/airline_logo/32/mu.png" alt="">
                <span class="slw-five-2-5" >东方航空&nbspMU5292</span>
                <span class="slw-five-2-5">&nbsp&nbsp波音737</span>
                <span class="slw-five-2-5" name="seat">&nbsp&nbsp <%int zuo  = Integer.parseInt(request.getParameter("zuot"));
                                                        if(zuo==1){
                                                        	out.println("头等舱");
                                                        }else{
                                                        	out.println("经济舱");
                                                        }
                              	
                                                        
                                                       %></span>
            </div>
            <div class="slw-five-2-6"><span style="font-size:10px" >${lists.flightFromTime.toString().substring(0,19)}</span></div>
            <div class="slw-five-2-7"><span style="font-size:10px">${lists.flightToTime.toString().substring(0,19)}</span></div>
            <div class="slw-five-2-8">首都国际机场T2</div>
            <div class="slw-five-2-9"></div>
            <div class="slw-five-2-10"></div>
            <div class="slw-five-2-11"></div>
            <div class="slw-five-2-12">
                <img src="images/6.png" alt="">
            </div>
            <div class="slw-five-2-15">武宿国际机场T2</div>
        </div>
      <!--第二行-->
        <div class="slw-five-3">
            <div class="slw-five-3-1">
                    <span class="slw-five-3-2">成人</span>
                     <span class="slw-five-3-3">退改￥111元起</span>
                    <span class="slw-five-3-4">行李额</span>
                    <span class="slw-five-3-5">￥370</span>
                    <span class="slw-five-3-6">x1</span>
            </div>

            <div class="slw-five-4">
                <span class="slw-five-4-1">纪建</span>
                <span class="slw-five-4-2">￥50</span>
                <span class="slw-five-4-3">x1</span>
            </div>

            <div class="slw-five-5">
                <span class="slw-five-5-1">燃油税</span>
                <span class="slw-five-5-2">免费</span>
            </div>

        </div>
      <!--第三行-->
        <div class="slw-five-6">
            <span class="slw-five-6-1">￥</span>
            <span class="slw-five-6-2" name ="price">${lists.moneyHeadPrice}</span>
        </div>
      

	<input type="hidden" name="seat" value="<%=zuo%>">
	<input type="hidden" name="point" value="${lists.flightFrom}">
	<input type="hidden" name="end" value="${lists.flightTo}">
	<input type="hidden" name="time" value="${lists.flightFromTime.toString().substring(0,19)}">
	<input type="hidden" name="Arrival" value="${lists.flightToTime.toString().substring(0,19)}">
	<input type="hidden" name="money" value="${lists.moneyHeadPrice}">
	  </div>
 </form>

<!--尾巴-->
  <div class="slw-six">
      Copyright© 1999-2019, ctrip.com. all rights reserved.
  </div>


</body>
</html>