<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>航空航天售票后台管理系统</title>
    <link rel="stylesheet" href="/aviation/assets/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">航空航天售票后台管理系统</div>
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">航班管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="administrators/lists" target="class">查看所有航班信息</a></dd>
                        <dd><a href="administrators/selectFlight" target="class">查询航班</a></dd>
                        <dd><a href="administrators/insertFlight" target="class">新增航班</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">用户以及营业点管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="point/lists" target="class">查看所有营业点</a></dd>
                        <dd><a href="point/insertPoint" target="class">增加营业点</a></dd>
                        <dd><a href="user/lists" target="class">查看所有的用户</a></dd>
                      
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="order/lists" target="class">订单管理</a></li>
                 <li class="layui-nav-item">
                    <a href="javascript:;">盈利统计</a>
                    <dl class="layui-nav-child">
                        <dd><a href="volume/index" target="class">各营业点本月盈利</a></dd>
                        <dd><a href="volume/index2" target="class">各营业点年盈利</a></dd>
                        <dd><a href="volume/index3" target="class">总盈利信息</a></dd>
                        <dd><a href="volume/index4" target="class">各营业点月收入对比</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <iframe  frameborder="0" name="class" src="administrators/huan/index" height="100%" width = "100%"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="/aviation/assets/layui/layui.all.js"></script>
<script>
  
</script>
</body>
</html>