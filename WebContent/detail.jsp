<%@page import="info.Dishes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜品详细信息的页面</title>
</head>
<body>
<%
Dishes dish=(Dishes)session.getAttribute("dish");
System.out.println(session.getId());
%>
<div style="text-align:right;font-size:36px;">

    <a href="mycart.jsp" class="ui-btn ui-icon-shop ui-btn-icon-left" style="width:300px;float:right">我的购物车</a>
</div>
<table align="center" cellpadding="20" cellspacing="20">
    <tr>
        <td>菜品编号</td>
        <td>菜品名称</td>
        <td>菜品价格</td>
        <td>菜品菜系</td>
        <td>菜品图片</td>
    </tr>
    <tr>
        <td><%=dish.getDishid() %></td>
        <td><%=dish.getDishname() %></td>
        <td><%=dish.getPrice() %></td>
        <td><%=dish.getCuisines() %></td>
        <td><img src="<%=dish.getPic() %>" width=208px height=156px></td>
    </tr>
    <tr>
        <td colspan="2"></td>
        <td><a href="docart.jsp">添加到购物车</a></td>
        <td><a href="HomePage.jsp">返回主页</a></td>
        
        <td colspan="2"></td>
    </tr>
</table>
</body>
</html>