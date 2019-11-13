<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>澳大利亚机票价格</title>
    <link rel="stylesheet" href="css/airfare.css">
    <link rel="stylesheet" href="css/cityselect.css">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<!--页面顶部-->
<div class="top">
    <div class="slw-top-1">
        <a href="http://localhost:63342/html/Aviation/index.html?_ijt=q78nlf6hjjcfnpo77he5u2q2cq">
            <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="index.html">
        </a>
    </div>
    <div class="slw-top-2"></div>
    <div class="slw-top-3">

        <a href="">登录</a>
        <a href="">个人中心</a>
    </div>
</div>
<!--导航栏-->
<div class="slw-one">
    <div class="slw-one-1">
        <a href="">首页</a>
        <a href="">预定与服务</a>
        <a href="">旅游度假</a>
        <a href="">旅游信息</a>
        <a href="">搭乘海航</a>
        <a href="">优惠与推荐</a>
        <a href="">UBDF俱乐部</a>
        <a href="">飞行+</a>
    </div>
    
    
    
</div>
<!--航班价格-->
<div class="slw-two">
    <img src="https://newstatic.hnair.com/hainanair/ibe/theme/hainan/images/loading.jpg" alt="">
     <!--航班选择  搜索-->
     <div class="slw-three">
         <!--线条-->
         <div class="slw-four">
         <div class="slw-four-1" >
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
             <div class="slw-four-2">
                 <div class="slw-four-3"></div>

             </div>
         </div>
             <div class="slw-four-4">

                 <div class="slw-four-5">航班查询</div>
                 <div class="slw-four-5">航班选择</div>
                 <div class="slw-four-5">航班概况</div>
                 <div class="slw-four-5">填写信息</div>
                 <div class="slw-four-5">订单支付</div>
                 <div class="slw-four-5">订单完成</div>
             </div>
         </div>
         <!--航班查询-->

         <div class="slw-five">
             <div class="slw-five-1">
               <div class="slw-five-2">起飞城市</div>
                 <div class="slw-five-3">
                     <!-- 在输入框加入id -->
                     <input type="text" class="cityinput" id="citySelect" placeholder="请输入出发地">
                 </div>
                 <script type="text/javascript" src="js/cityselect.js"></script>
                 <script type="text/javascript">
                     var test=new Vcity.CitySelector({input:'citySelect'});
                 </script>
             </div>
             <div class="slw-five-1">
                 <div class="slw-five-2">起飞城市</div>
                 <div class="slw-five-3">
                     <!-- 在输入框加入id -->
                     <input type="text" class="cityinput" id="citymudidi" placeholder="请输入出发地">
                 </div>

                 <script type="text/javascript" src="js/cityselect.js"></script>
                 <script type="text/javascript">
                     var test=new Vcity.CitySelector({input:'citymudidi'});
                 </script>
             </div>
             <div class="slw-five-1">
                 <div class="slw-five-2">出发时间</div>
                 <div class="slw-five-3">

                     <input  type="date" class="cityinput"  value="请输入时间">
                 </div>


             </div>
             <div class="slw-five-1">
                 <div class="slw-five-2">成员人数</div>
                 <div class="slw-five-3">
                     <input  type="text" class="cityinput"  placeholder="请输入成员人数">
                 </div>

             </div>
             <div class="slw-five-1">
                 <button type="button" class="btn btn-danger" id="slw-five-4">搜索导航</button>
             </div>
         </div>
         <!--天气-->
         <iframe  class="slw-ww" src="http://tianqi.5ikfc.com:90/plugin-code/?style=4&dy=7&fs=20&bg=&cl=990000&th=990000&tl=0033ff&city=taiyuan" allowTransparency="true" frameborder="0" scrolling="no" width="1200" height="50" id="weather_frame"></iframe>

         <!--航班找到几个-->
         <div class="slw-six">
             <span class="slw-six-1">已找到</span>
             <span class="slw-six-2">7</span>
             <span class="slw-six-1">个航班，请选择去程航班</span>
         </div>

         <!--航班展示-->
         <div class="slw-sever">
            <div class="slw-server-1">
                <!--出发时间-->
                <div class="slw-server-2">
                    <div class="slw-server-3">17:15</div>
                     <div clss="slw-server-4">北京首都国际机场</div><!--不要超过10个字-->
                    <div class="slw-server-5">11月3日</div>

                </div>

                <!--到达时间-->
                <div class="slw-server-6">
                    <div class="slw-server-3">19：30</div>
                    <div clss="slw-server-4">深圳宝安机场</div><!--不要超过10个字-->
                    <div class="slw-server-5">11月3日</div>
                </div>
                <!--飞机图标-->
                <div class="slw-server-7">
                    <div class="slw-server-8"></div>
                    <div class="slw-server-9"></div>
                    <div class="slw-server-10">
                        <img src="images/6.png" alt="">
                    </div>
                </div>
                <!--座位等级-->
                <div class="slw-server-11">

                 <div class="slw-eight-2">
                     <input type="radio" name="place" value="0" class="slw-eight-1">
                    <span class="slw-eight-3">头等舱</span>
                    <span class="slw-eight-4">座位:&nbsp200</span>
                    <span class="slw-eight-5">余100</span>
                    <span class="slw-eight-6">￥1888</span>
                    <input type="submit" id="slw-eight-7" class="btn btn-danger" value="预定">
                 </div>
                 <div class="slw-eight-8">
                    <input type="radio" name="place" value="1" class="slw-eight-9">
                    <span class="slw-eight-10">经济舱</span>
                    <span class="slw-eight-11">座位:&nbsp200</span>
                    <span class="slw-eight-12">余100</span>
                    <span class="slw-eight-13">￥1088</span>
                     <input type="submit" id="slw-eight-14" class="btn btn-danger" value="预定">
                 </div>

                </div>








            </div>

         </div>





     </div>
</div>
<!--尾巴-->
<div class="slw-h">
    <div class="slw-t">
   <img src="images/5.png" alt="">
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
</html>
