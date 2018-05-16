package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CartItem;
import dao.OrderDAO;
/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  

        HttpSession session = request.getSession();
        Map<Integer,CartItem> map=(Map<Integer,CartItem>)session.getAttribute("cart");
        double count=0;//显示出总价格
        String ordername = "";
        for(Map.Entry<Integer,CartItem> entry : map.entrySet()){
            //计算出每一样的书籍一共花了多少钱
        	System.out.println("******"+map.size()); 

	        double price=entry.getValue().getNumber()*entry.getValue().getDish().getPrice();    
	            //计算出一共花了多少钱
	        count=count+price;
	        ordername+=entry.getValue().getDish().getDishname();
        }
        System.out.println("订单名为："+ordername); 
        System.out.println("总价为："+count);
        String username = request.getParameter("name"); 
        System.out.println(username); 
        String address = request.getParameter("address");  
        System.out.println(address); 
        String phone = request.getParameter("phone");  
        System.out.println(address);
        
        OrderDAO u = new OrderDAO();  
        u.addOrder(username,ordername,count,address,phone);
        PrintWriter out = response.getWriter();
        out.print("<script>alert('付款成功！'); window.location='HomePage.jsp' </script>");
        out.flush();
        out.close();
        
	}

}
