package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Spring_Customer;

/**
 * Servlet implementation class Updata
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	        request.setCharacterEncoding("utf-8");  
	        response.setContentType("text/html;charset=utf-8");  
	        String newpassword = request.getParameter("newpassword"); 
	        String realname = request.getParameter("realname"); 
	        String address = request.getParameter("address"); 
	        String email = request.getParameter("email"); 
	        String phone = request.getParameter("phone");
	        HttpSession session = request.getSession();
	        String name=(String)session.getAttribute("customer");
	        new Spring_Customer().update(name, newpassword, realname, address, email, phone);    
	        request.setAttribute("msg", "ÐÞ¸Ä³É¹¦£¡");  
	        request.getRequestDispatcher("/HomePage.jsp").forward(request, response); 
	}

}
