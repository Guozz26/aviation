<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        body{
        margin: 0;padding: 0;
        }
 .gr{
     width: 100%;height: 900px;
     background: url("https://newstatic.hnair.com/hainanair/ibe/theme/hainan/images/loading.jpg");


 }
 .gs{
float: left;
     width: 500px;height: 500px;
     margin-left: 450px;
     margin-top: 300px;


 }
.img-1{

    width: 200px; height: 200px;
    float: left;
    margin-top: -150px   ;
margin-left: 150px;
}
 .img-2{
     width: 200px; height: 200px;
     float: left;
     margin-left: -170px;

        }
        .gs span{
            color: red;
            font-size: 20px;
            font-weight:bold;
            margin-left: -140px;
            margin-top: -28px;
                float: left;
        }

    </style>

    <script>
        window.onload =function () {

            var i =2
            var t = setInterval(function () {
                i--

                if(i==0){
                    clearInterval(t)
                    location.href="core.html"
                }
            },500)
        }


    </script>
    
</head>
<body>
<div class="gr" >
    <div class="gs">
    <img src="https://www.qantas.com/content/dam/qantas/logos/qantas-masterbrand-logo-40px.svg" alt=""  class="img-1">
        <span>晋南航空 ，与你相伴</span>
    <img src="https://newstatic.hnair.com/hainanair/ibe/theme/hainan/images/load02.gif" alt=""  class="img-2">
</div>
</div>
<div >
    
    
</div>




</body>
</html>