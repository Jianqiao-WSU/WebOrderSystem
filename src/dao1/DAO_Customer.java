package dao1;
import java.sql.*;
//import dbc.DatabaseConnection;

public class DAO_Customer {	
	public String findUsername(String username){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        System.out.println("123123123");
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
            	System.out.println(rs.getString("password")+"******");
                psw=rs.getString("password");  
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
	
	public String findUseraddress(String username){
        String psw = null;  
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {  
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
        try{
        	Class.forName("oracle.jdbc.OracleDriver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
    	    String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    	    con = DriverManager.getConnection(dbURL, "reaper", "970927");
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
            	System.out.println("´íÎó£¡"); 
            }  
            if(rs.next()){  
            	System.out.println("³É¹¦£¡");  
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
}
