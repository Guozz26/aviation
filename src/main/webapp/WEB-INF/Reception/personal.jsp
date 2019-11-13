<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="/aviation/assets/css/core.css" rel="stylesheet">
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

</head>

<body>
<div class="top">
    <div class="slw-top-1">
        <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt="">
    </div>
    <div class="slw-top-2"></div>
    <div class="slw-top-3">
        <a href="" style="text-decoration:none">首页</a>
    </div>


</div>
<div class="bsg-Middle-1">

<div class="bsg-Middle-2">
<div class="bsg-Middle-2-1">

</div>
</div>
    <div class="bsg-Middle-3">
        <span >尊敬的用户</span>

    </div>
    <div class="bsg-Middle-3-1">
        <a href="register.html"><span  style="color: white; text-decoration: none;">编辑资料></span></a>
    </div>
<div class="bsg-Middle-3-2">
    <span> 余额：</span>
    <span>100元</span>
<!--    <div style="margin-left: 60px">
        <a href=""><span>充值</span></a>
    </div>-->

</div>

</div>

      <!--选项卡-->

<div class="bsg-Middle-4">
<!--标题栏-->
<div class="head" id="head">
    <ul>
        <li id="L1" onclick="Tab(1)"><a href="#">全部订单</a></li>
        <li id="L2" onclick="Tab(2)"><a href="#">未出行</a></li>
        <li id="L3" onclick="Tab(3)"><a href="#">待付款</a></li>
    </ul>
</div>
<!--里面的内容-->
<div id="d1">
    <ul>
        <li style="list-style: none">

                <div  class="bsg-inside-1" >
                    <div class="bsg-inside-1-1" >
                         <div class="bsg-inside-1-2"></div>
                    </div>
                 <h2 >
                        <span>南京</span> <span>---</span> <span>太原</span>

                  </h2>
                    <p>
                        <span>2019-05-12 09:45</span>  <span>至</span> <span>11：40 UMB2135</span>
                    </p>
                    <div class="bsg-inside-1-3" >
                        <span class="bsg-iside-left">￥470</span><span class="bsg-inside-right" >已出票</span>



                    </div>

                </div>


        </li>

    </ul>
</div>
    <!--未出行订单-->
<div id="d2">
    <ul style="list-style: none">
        <li style="list-style: none">
            <div  class="bsg-inside-1" >
                <div class="bsg-inside-1-1" >
                    <div class="bsg-inside-1-2"></div>
                </div>
                <h2 >
                    <span>南京</span> <span>---</span> <span>太原</span>
                </h2>
                <p>
                    <span>2019-05-12 09:45</span>  <span>至</span> <span>11：40 UMB2135</span>
                </p>
                <div class="bsg-inside-1-3" >
                    <span class="bsg-iside-left">￥470</span><span class="bsg-inside-right" >待出行</span>
                </div>
            </div>
        </li>
    </ul>
</div>
    <!--待付款订单-->
<div id="d3">
    <ul style="list-style: none">


        <li style="list-style: none">

            <div  class="bsg-inside-1" >
                <div class="bsg-inside-1-1" >
                    <div class="bsg-inside-1-2"></div>
                </div>
                <h2 >
                    <span>南京</span> <span>---</span> <span>太原</span>

                </h2>
                <p>
                    <span>2019-05-12 09:45</span>  <span>至</span> <span>11：40 UMB2135</span>
                </p>
                <div class="bsg-inside-1-3" >
                    <span class="bsg-iside-left">￥470</span><span class="bsg-inside-right" ><a href="">立即付款</a></span>
                </div>
            </div>
        </li>
    </ul>
</div>
</div>
</body>
</html>