package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Spring_Customer;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        String username = request.getParameter("username");  
        System.out.println(username); 
        String password = request.getParameter("password");  
        System.out.println(password); 
        String confirmpassword = request.getParameter("confirmpassword");//�õ������������  
        System.out.println(confirmpassword); 
        if(username==null||username.trim().isEmpty()){  
            request.setAttribute("msg", "�ʺŲ���Ϊ��");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        if(password==null||password.trim().isEmpty()){  
            request.setAttribute("msg", "���벻��Ϊ��");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        if(!password.equals(confirmpassword)){  
            request.setAttribute("msg", "������������벻ͬ");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        Spring_Customer u = new Spring_Customer();  
        u.addUser(username,password);//����addUser��������  
        request.setAttribute("msg", "��ϲ��"+username+"��ע��ɹ�");  
        PrintWriter out = response.getWriter();
        out.print("<script>alert('ע��ɹ������¼��'); window.location='Login.jsp' </script>");
        out.flush();
        out.close();
        //request.getRequestDispatcher("/HomePage.jsp").forward(request, response);  

    
	}

}
