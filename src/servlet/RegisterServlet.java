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
        String confirmpassword = request.getParameter("confirmpassword");//得到表单输入的内容  
        System.out.println(confirmpassword); 
        if(username==null||username.trim().isEmpty()){  
            request.setAttribute("msg", "帐号不能为空");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        if(password==null||password.trim().isEmpty()){  
            request.setAttribute("msg", "密码不能为空");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        if(!password.equals(confirmpassword)){  
            request.setAttribute("msg", "两次输入的密码不同");  
            request.getRequestDispatcher("/Sign_up.jsp").forward(request, response);  
            return;  
        }  
        Spring_Customer u = new Spring_Customer();  
        u.addUser(username,password);//调用addUser（）方法  
        request.setAttribute("msg", "恭喜："+username+"，注册成功");  
        PrintWriter out = response.getWriter();
        out.print("<script>alert('注册成功，请登录！'); window.location='Login.jsp' </script>");
        out.flush();
        out.close();
        //request.getRequestDispatcher("/HomePage.jsp").forward(request, response);  

    
	}

}
