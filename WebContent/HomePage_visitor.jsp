<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="service.DishServiceImpl"%>
<%@page import="info.Dishes"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>网上点餐系统</title>

<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
<link href="css/font-awesome.css" rel="stylesheet">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>

</head>
<style>	
	#page-header {
	    background-color:black;
	    
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
	
	h1 {
		color:black; 	
		font-weight: bold;
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

<div data-role="page">
  <div data-role="header">
    <h1>网上点餐系统</h1>
		<div>
			<a href="Login.jsp"><button>登录</button></a>
			<a href="Sign_up.jsp"><button>注册</button></a>
			<form name="formlogin" action="SearchServletvisitor" method="POST">
				<div class="form-group">
					<input type="text" class="form-control" name="search" style='display:inline-block'>
					<input type="submit" value="搜索" data-icon="search" style='display:inline-block'>
				</div>  
			</form>
		</div>
  </div>

  <div data-role="main" class="ui-content">		
		
		<%
	    //图书的实体类创建一个对象
	    Dishes book=new Dishes();
	    //图书的业务逻辑层层
	    DishServiceImpl service=new DishServiceImpl();
	    List<Dishes> list=service.select(book);
	%>
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
	        <td><%=b.getDishname()%></a></td>
	        <td><%=b.getCuisines() %></td>
	        <td><%=b.getPrice() %></td>
	        <td><img src="<%=b.getPic() %>" width=208px height=156px></td>
	    </tr>
	    <%} %>
	</table>
	
  </div>

  <div data-role="footer">
    <h1>网上点餐系统</h1>
  </div>
</div> 
	
</body>
</html>