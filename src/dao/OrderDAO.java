package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.Dishes;
import info.Order;
public class OrderDAO {
	public void addOrder(String username,String ordername,double count,String address, String phone){
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
            String sql = "INSERT INTO REAPER.\"tb_order\" VALUES (trunc(DBMS_RANDOM.value(1,900000000)),'"+username+"', '"+ordername+"','"+count+"','"+address+"','"+phone+"',to_char(sysdate,'YYYY-MM-DD HH24:MI:SS') )";  
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
	
    public List<Order> myOrder(String username) throws ClassNotFoundException{
    	Connection con=null;
        ResultSet rs=null;
        Statement stmt = null;
        String sql="SELECT * FROM REAPER.\"tb_order\" where \"username\" = '"+username+"'";
        ArrayList<Order> list=new ArrayList<Order>();
        try {
            con=BaseDao.getCon();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
            	Order order=new Order();
            	order.setOrderId(rs.getString("id"));
            	order.setName(rs.getString("username"));
            	order.setOrdername(rs.getString("ordername"));
            	order.setTotalPrice(rs.getString("price"));
            	order.setAddress(rs.getString("address"));
            	order.setMobile(rs.getString("phone"));
            	order.setCreateTime(rs.getString("time"));
                list.add(order);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
	
	public void searchOrder(String username){
        Connection con =null;  
        PreparedStatement pstmt =null;  
        ResultSet rs = null;  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");  
        
        try{
        	con = ds.getConnection();
    	    System.out.println(con);
            String sql = "SELECT * FROM REAPER.\"tb_order\" where \"username\" = '"+username+"'";  
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
}
