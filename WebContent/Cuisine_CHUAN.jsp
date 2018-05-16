<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="service.DishServiceImpl"%>
<%@page import="info.Dishes"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>鲁菜</title>

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
			<div>
				<a href="Update_Customer.jsp">查询并修改个人信息</a>	
			</div>
			<div>
				<a href="myorder.jsp">查询个人订单</a>	
			</div>
			<div>
				<form name="formlogin" action="SearchServlet" method="POST">
							<div class="form-group">
								<input type="text" class="form-control" name="search">
								<input type="submit" value="搜索">
							</div>  
				</form>
			</div>
			
	</div>
	
	
	<div id="page-wrap">
	
		<ul id="breadcrumb">
		  <li><a href="HomePage.jsp"><span class="icon icon-home"> </span></a></li>
		  <li><a href="Cuisine_LU.jsp"><span class="icon icon-beaker"> </span> 鲁菜</a></li>
		  <li><a href="Cuisine_CHUAN.jsp"><span class="icon icon-double-angle-right"></span> 川菜</a></li>
		  <li><a href="Cuisine_YUE.jsp"><span class="icon icon-rocket"> </span> 粤菜</a></li>
		  <li><a href="Cuisine_HUAI.jsp"><span class="icon icon-arrow-down"> </span> 淮扬菜</a></li>
		  <li><a href="Cuisine_WEST.jsp"><span class="icon icon-beaker"> </span> 西餐</a></li>
		  <li><a href="Cuisine_Desserts.jsp"><span class="icon icon-rocket"> </span> 甜点</a></li>
		</ul>
		
		
		<%
	    //图书的实体类创建一个对象
	    Dishes book=new Dishes();
	    //图书的业务逻辑层层
	    DishServiceImpl service=new DishServiceImpl();
	    List<Dishes> list=service.selectChuan(book);
	%>
	<div style="text-align:right;font-size:100px;">
	    <a href="mycart.jsp">我的购物车</a>
	</div>
	<table align="center" width="100%">
	    <tr>
	        <th>编号</th>
	        <th>菜名</th>
	        <th>菜系</th>
	        <th>价格</th>
	        <th>图片</th>
	    </tr>
	    <%
	        for(Dishes b:list){    
	    %>
	    <tr align="center">
	        <td><%=b.getDishid() %></td>
	        <td><a href="dobook.jsp?id=<%=b.getDishid()%>"><%=b.getDishname()%></a></td>
	        <td><%=b.getCuisines() %></td>
	        <td><%=b.getPrice() %></td>
	        <td><img src="<%=b.getPic() %>" width=208px height=156px></td>
	    </tr>
	    <%} %>
	</table>
    
	
	<div id="page-footer">
		网上点餐系统
	</div>
	
</body>
</html>