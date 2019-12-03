<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,aviation.*;" %>
<%
	int role = Integer.parseInt(session.getAttribute("role").toString());
%>
<!DOCTYPE html>
<html>

<head>
<title>首页</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="/aviation/assets/css/bootstrap.css">
</head>
<body>
	<h3 align="center"> 订单信息 </h3>
	<hr color="red">
		
<%-- 			<table class="qxd_carousel_control_right_button_con" style="width: 998px;margin:auto;margin-left:30px	float:right;">
        <form action="/aviation/order/lists/abc" method="post">
        <tr>
            <td>
                <input type="text" size="30" name="orderUserName" style="height:40px" placeholder="请输入姓名">
            </td>
            	<%
				if(role==3){
			%>
            <td>
                <input type="text" size="30" name="orderidcardr" style="height:40px" placeholder="请输入身份证号">
            </td>
            	<%
				}
			%>
            <td><input type="submit" value="搜素" style="height:40px;width: 120px" ></td>
        </tr>
        </form>
    </table>
		 --%>
		
    <br>
	<div class="container" align="center">
	<table class="table table-striped">
	
		<tr>
			<th>订单编号</th>
			<th>买家姓名</th>
			<th>买家身份账号</th>
			<th>下单时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${lists}" var="list">
			<tr>
				<td>${list.orderId}</td>
				<td>${list.orderUserName }</td>
				<td>${list.orderIdcard }</td>
				<td>${list.orderTime }</td>

				<td>
					<a href="lists/listInfo/${list.orderId}" >查看详细信息</a>
					<a href="lists/delOrder/${list.orderId}">删除订单</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>

	</div>
</body>

</html>
