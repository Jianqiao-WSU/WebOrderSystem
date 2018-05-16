<%@page import="service.DishServiceImpl"%>
<%@page import="service.DishService"%>
<%@page import="info.Dishes"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理图书详细信息的页面</title>
</head>
<body>
<%
    Dishes book=new Dishes();
    String sid=request.getParameter("id");
    Integer id=Integer.parseInt(sid);
    DishService service=new DishServiceImpl();
    book.setDishid(id);
    Dishes books=service.getDish(book);
    
    session.setAttribute("dish", books);
    
    Dishes dish=(Dishes)session.getAttribute("dish");
    System.out.println("123456789"+dish.getDishname());
    System.out.println(session.getId());
    response.sendRedirect("detail.jsp");
%>
</body>
</html>