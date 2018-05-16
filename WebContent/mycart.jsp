<%@page import="dao.CartItem"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的购物车的页面</title>
</head>
<body>
<table width="100%" align="center" border="1px">
	<h1>添加购物车成功！</h1>
    <tr>
        <th>菜品编号</th>
        <th>菜品名称</th>
        <th>菜品单价</th>
        <th>菜品数量</th>
        <th>价格总计</th>
    </tr>
    <%
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
        <td><%=entry.getKey() %></td>
        <td><%=entry.getValue().getDish().getDishname() %></td>
        <td><%=entry.getValue().getDish().getPrice() %></td>
        <td><%=entry.getValue().getNumber() %></td>
        <td><%=entry.getValue().getDish().getPrice() * entry.getValue().getNumber()%></td>
        
    </tr>
    <%} %>
    <tr>
        <td colspan="4" align="right">价格总计</td>
        <td><%=count %></td>
    </tr>
</table>
<div style="text-align:center;font-size:36px;">
    <a href="HomePage.jsp">主页列表</a>	
    <a href="Order_confirm.jsp">提交订单</a>	
</div>    
</body>
</html>