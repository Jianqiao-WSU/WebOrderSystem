package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       request.setCharacterEncoding("utf-8");  
	        response.setContentType("text/html;charset=utf-8");  
	        String search = request.getParameter("search"); 
	        System.out.println(search); 
            HttpSession session = request.getSession();
            session.setAttribute("search", search);
            request.getRequestDispatcher("/Search.jsp").forward(request, response);  
	}
}
