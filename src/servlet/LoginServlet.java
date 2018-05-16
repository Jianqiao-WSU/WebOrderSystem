package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Spring_Customer;

public class LoginServlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;  
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        String username = request.getParameter("username"); 
        System.out.println(username); 
        String password = request.getParameter("password");  
        System.out.println(password); 
        //String psw =new DAO_Customer().findUsername(username);    
        //String psw =new Logintest().findUsername(username);    
        String psw =new Spring_Customer().findUsername(username);    
        System.out.println(psw); 
        if(psw ==null){  
            request.setAttribute("msg", "û������û���");  
            System.out.println("û������û���");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);  
            return;  
        }  
        if(psw!=null&&!psw.equals(password)){  
            request.setAttribute("msg", "����������������룡");  
            System.out.println("����������������룡");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);  
            return;  
        }  
        if(psw.equals(password)){  
            request.setAttribute("msg", "�û���"+username+",��ӭ����");  
            HttpSession session = request.getSession();
            session.setAttribute("customer", username);
            request.getRequestDispatcher("/HomePage.jsp").forward(request, response);  
            //response.setHeader("Refresh","1;url=welcome.jsp");  
        }  
          
    }  
}
