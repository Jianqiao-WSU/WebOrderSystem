<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="dao.*"%>
<%@page import="info.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>网上点餐系统</title>

<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
<link href="css/font-awesome.css" rel="stylesheet">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</head>
<style>
	#page-header {
	    background-color:black;
	    color:white;
	    text-align:center;
	    padding:5px;
	}
	#page-wrap {
	    line-height:30px;
	    background-color:#eeeeee;
	    height:100%;
	    width:100%;
	    float:left;
	    padding:5px; 
	}
	#page-footer {
	    background-color:black;
	    color:white;
	    clear:both;
	    text-align:center;
	    padding:5px; 
	}
	
	
	div {
	    display: block;
	}
	
	ol, ul ,li{
	    padding-left: 0;
	    list-style-type: none;
	}
	
	ul, menu, dir {
	    display: block;
	    list-style-type: disc;
	    -webkit-margin-before: 1em;
	    -webkit-margin-after: 1em;
	    -webkit-margin-start: 0px;
	    -webkit-margin-end: 0px;
	    -webkit-padding-start: 40px;
	}
	
	li {
	    display: list-item;
	    text-align: -webkit-match-parent;
	    float:left;
	}
	
	.addr-em-hidden, .clearfix:after, .dialog-address .modify, .shopping-cart .disabled-food a.minus, .shopping-cart .disabled-food a.plus, .shopping-cart .discount-food a.minus, .shopping-cart .discount-food a.plus, .unvisialbe {
	    visibility: hidden;
	}
	
	.rest-li:nth-child(4n+2) .rest-outer {
	    left: 242px;
	}
	.rest-list .transition {
	    transition: left .5s;
	}
	home_dce239b8.css:1
	.rest-outer {
	    padding: 20px 16px 0;
	    background-color: #fff;
	}
	home_dce239b8.css:1
	.rest-outer, .restaurant {
	    width: 210px;
	    height: 250px;
	}
	home_dce239b8.css:1
	.imgsort-wrapper, .notice, .rest-list, .rest-outer, .restaurant .others {
	    overflow: hidden;
	}
</style>

<body>

	
	<div id="page-header">
		<h1>网上点餐系统</h1>
			<div>
			<%String name=(String)session.getAttribute("customer"); %>
				当前用户：<span id="username"><%=name %></span>
			</div>
	</div>
	
	<%
	Order order=new Order();
    OrderDAO service=new OrderDAO();
    List<Order> list=service.myOrder(name);
	%>
	<div id="page-wrap">
			
	<table align="center" width="100%">
	    <tr>
	        <th>订单号</th>
	        <th>收货人</th>
	        <th>订单名</th>
	        <th>订单总价</th>
	        <th>配送地址</th>
	        <th>电话</th>
	        <th>创建时间</th>
	    </tr>
	    <%
	        for(Order b:list){
	    %>
	    <tr align="center">
	        <td><%=b.getOrderId() %></td>
	        <td><%=b.getName() %></td>
	        <td><%=b.getOrdername() %></td>
	        <td><%=b.getTotalPrice() %></td>
	        <td><%=b.getAddress() %></td>
	        <td><%=b.getMobile() %></td>
	        <td><%=b.getCreateTime() %></td>
	    </tr>
	    <%} %>
	</table>
    <a href="HomePage.jsp">返回</a>
	
	<div id="page-footer">
		网上点餐系统
	</div>
	
</body>
</html>