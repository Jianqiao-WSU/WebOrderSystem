package dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logintest {
	public String findUsername(String username){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
     // 创建Spring的ApplicationContext  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx); // 输出Spring容器  
        
        // 通过 Spring 容器获取 Person 实例，并为 Person 实例设置属性值（这种方式称为控制反转，IoC）  
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        try{
        	con = ds.getConnection();
			Statement stmt = con.createStatement();  
			System.out.println(con);
			String sql = "select * from REAPER.\"tb_customer\" where \"username\" ='"+username+"'";  
            System.out.println(sql); 
            rs = stmt.executeQuery(sql);
            if(rs==null){  
                return null;  
            }  
            if(rs.next()){  
            	System.out.println(rs.getString("password")+"******");
                psw=rs.getString("password");  
            }else{  
                psw=null;  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return psw;  
        }

	public String findUseraddress(String username){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
        	String sql = "select * from REAPER.\"tb_customer\" where \"username\" ='"+username+"'";  
            System.out.println(sql); 
            //pstmt = con.prepareStatement(sql);  
             
            //pstmt.setString(1, username);  
            //System.out.println(pstmt);
            //rs = pstmt.executeQuery();  
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(sql);
            
            if(rs==null){  
                return null;  
            }  
            if(rs.next()){  
            	System.out.println(rs.getString("address")+"******");
                psw=rs.getString("address");  
            }else{  
                psw=null;  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                if(pstmt!=null)pstmt.close();  
                if(con!=null)con.close();  
                }   
            catch (SQLException e) {          
                                    }  
        }  
        return psw;  
        }
	
	public String findUserphone(String username){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
        	String sql = "select * from REAPER.\"tb_customer\" where \"username\" ='"+username+"'";  
            System.out.println(sql); 
           
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(sql);
            
            if(rs==null){  
                return null;  
            }  
            if(rs.next()){  
            	System.out.println(rs.getString("phone")+"******");
                psw=rs.getString("phone");  
            }else{  
                psw=null;  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                if(pstmt!=null)pstmt.close();  
                if(con!=null)con.close();  
                }   
            catch (SQLException e) {          
                                    }  
        }  
        return psw;  
        }
	
	public void addUser(String username,String psw){
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
    	    
            String sql = "INSERT INTO REAPER.\"tb_customer\" VALUES (trunc(DBMS_RANDOM.value(1,1000000)),'"+username+"', '"+psw+"','','','','')";  
            System.out.println(sql);
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                if(pstmt!=null)pstmt.close();  
                if(con!=null)con.close();  
                }   
            catch (SQLException e) {
            }  
        }  
    }  
	
	public String[] updateUser(String username){
		String info[] = new String[5];  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
        	String sql = "select * from REAPER.\"tb_customer\" where \"username\" ='"+username+"'";  
            System.out.println(sql); 
            //pstmt = con.prepareStatement(sql);  
             
            //pstmt.setString(1, username);  
            //System.out.println(pstmt);
            //rs = pstmt.executeQuery();  
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(sql);
            
            if(rs==null){  
                return null;  
            }  
            while(rs.next()){  
                info[0]=rs.getString("password");  
                info[1]=rs.getString("realname");
                info[2]=rs.getString("address");
                info[3]=rs.getString("email");
                info[4]=rs.getString("phone");
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                if(pstmt!=null)pstmt.close();  
                if(con!=null)con.close();  
                }   
            catch (SQLException e) {          
                                    }  
        }  
        return info;  
        }
	
	public void update(String username,String newpassword,String realname,String address,String email,String phone){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
    	    
    	    String sql ="UPDATE REAPER.\"tb_customer\" set \"password\"='"+newpassword+"',\"realname\"='"+realname+"',\"address\"='"+address+"',\"email\"='"+email+"',\"phone\"='"+phone+"' WHERE \"username\"='"+username+"'";  
            System.out.println(sql); 
            //pstmt = con.prepareStatement(sql);  
             
            //pstmt.setString(1, username);  
            //System.out.println(pstmt);
            //rs = pstmt.executeQuery();  
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(sql);
            
            if(rs==null){  
            	System.out.println("错误！"); 
            }  
            if(rs.next()){  
            	System.out.println("成功！");  
            }else{  
                psw=null;  
            }  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                if(pstmt!=null)pstmt.close();  
                if(con!=null)con.close();  
                }   
            catch (SQLException e) {          
                                    }  
        }    
        }
	
//	public static void main(String[] args) throws SQLException {  
//        // 创建Spring的ApplicationContext  
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
//        System.out.println(ctx); // 输出Spring容器  
//  
//        // 通过 Spring 容器获取 Person 实例，并为 Person 实例设置属性值（这种方式称为控制反转，IoC）  
//        DataSource ds = (DataSource)ctx.getBean("dataSource");  
//        //p.info();  
//        String psw = null;  
//        Connection conn = null;
//        ResultSet rs = null;  
//		try {
//			conn = ds.getConnection();
//			Statement stmt = conn.createStatement();  
//			System.out.println(conn);
//			String sql = "select * from REAPER.\"tb_customer\" where \"username\" ='123'";  
//            System.out.println(sql); 
//            rs = stmt.executeQuery(sql);
//            if(rs==null){  
//            	System.out.println("错误！");
//            }  
//            if(rs.next()){  
//            	System.out.println(rs.getString("password")+"******");
//                psw=rs.getString("password");  
//            }else{  
//                psw=null;  
//            }  
//		} catch (SQLException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}      
//    }  
}
