<%@page import="java.util.*"%>
<%@page import="service.DishServiceImpl"%>
<%@page import="info.Dishes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜品列表的页面</title>
</head>
<body>
<%
    //图书的实体类创建一个对象
    Dishes book=new Dishes();
    //图书的业务逻辑层层
    DishServiceImpl service=new DishServiceImpl();
    List<Dishes> list=service.select(book);
%>
<div style="text-align:right;font-size:36px;">
    <a href="mycart.jsp">我的购物车</a>
</div>
<table align="center" width="100%">
    <tr>
        <th>编号</th>
        <th>书名</th>
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

</body>
</html>