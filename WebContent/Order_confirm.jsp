<%@page import="dao.CartItem"%>
<%@page import="java.util.Map"%>
<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的购物车的页面</title>
</head>
<body>
<form name="formlogin" action="OrderServlet" method="POST">
	<table width="100%" align="center" border="1px">
	    <tr>
	        <th>菜品名称</th>
	        <th>菜品单价</th>
	        <th>菜品数量</th>
	        <th>价格</th>
	    </tr>
	    <%
	    
	    	String name=(String)session.getAttribute("customer");
	    	String address =new Spring_Customer().findUseraddress(name);
	    	String phone =new Spring_Customer().findUserphone(name);
	    	System.out.println(name);
	        //1:将添加到购物车里面的物品显示出来
	        Map<Integer,CartItem> map=(Map<Integer,CartItem>)session.getAttribute("cart");
	        //2:将购物车里面的内容遍历出来
	        double count=0;//显示出总价格
	        for(Map.Entry<Integer,CartItem> entry : map.entrySet()){
	            //计算出每一样的书籍一共花了多少钱
	            double price=entry.getValue().getNumber()*entry.getValue().getDish().getPrice();    
	            //计算出一共花了多少钱
	            count=count+price;
	    %>
	    <tr align="center">    
	        <td name="dishname"><%=entry.getValue().getDish().getDishname() %></td>
	        <td name="dishprice"><%=entry.getValue().getDish().getPrice() %></td>
	        <td name="dishnumber"><%=entry.getValue().getNumber() %></td>
	        <td name="dishall"><%=entry.getValue().getDish().getPrice() * entry.getValue().getNumber()%></td>
	        
	    </tr>
	    <%} %>
	    <tr>
	        <td colspan="3" align="right">价格总计:</td>
	        <td align="center" name="all"><%=count %></td>
	        
	    </tr>
	</table>
	<div style="text-align:center;">
	<div align="left">用户名:<input name="name" readonly="true" value="<%=name %>"></div>
	<div align="left">订单地址:<input name="address" value="<%=address %>" style="width:200px;"></div>
	<div align="left">电话:<input name="phone" value="<%=phone %>" style="width:200px;"></div>
	<input type="submit" align="center" value="确认订单并付款"></div>
</form>

<div style="text-align:center;font-size:36px;">
    <a href="HomePage.jsp">主页列表</a>
</div>
</body>
</html>