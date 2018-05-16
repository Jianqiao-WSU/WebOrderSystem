package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author BieHongLi 
* @version ����ʱ�䣺2017��2��27�� ����10:09:00 
* �������ݿ�Ĺ�����
*/
public class BaseDao {

//    private static String driver="oracle.jdbc.driver.OracleDriver";
//    private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
//    private static String user="reaper";
//    private static String password="970927";       
    
    /***
     * �������ݿ�ķ���
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getCon() throws ClassNotFoundException, SQLException{
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");  
        System.out.println(ctx);
        DataSource ds = (DataSource)ctx.getBean("dataSource");
        
        System.out.println("���Լ������ݿ�ɹ�");
        Connection con = ds.getConnection();
    	
        //Class.forName(driver);//�������ݿ�����
        
        //Connection con=DriverManager.getConnection(url, user, password);
        System.out.println("�������ݿ����ӳɹ�");
        return con;
    }
    
    /***
     * �ر����ݿ�ķ���
     * @param con
     * @param ps
     * @param rs
     */
    public static void close(Connection con,PreparedStatement ps,ResultSet rs){
        if(rs!=null){//�ر���Դ����������쳣
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    /***
     * ͬ����ɾ�ĵķ���
     * @param sql
     * @param arr
     * @return
     */
    public static boolean addUpdateDelete(String sql,Object[] arr){
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con=BaseDao.getCon();//��һ�� ���������ݿ�Ĳ���
            ps=con.prepareStatement(sql);//�ڶ�����Ԥ����
            //������������ֵ
            if(arr!=null && arr.length!=0){
                for(int i=0;i<arr.length;i++){
                    ps.setObject(i+1, arr[i]);
                }
            }
            int count=ps.executeUpdate();//���Ĳ���ִ��sql���
            if(count>0){
                return true;
            }else{
                return false;
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
        try {
            BaseDao.getCon();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
