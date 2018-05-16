package dao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import info.Dishes;

public class DishDaoImpl implements DishDao{
    public List<Dishes> select(String sql, Object[] arr) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            con=BaseDao.getCon();//��һ���������ݿ�
            ps=con.prepareStatement(sql);//�ڶ�����Ԥ����
            if(arr!=null){
                for(int i=0;i<arr.length;i++){
                    ps.setObject(i+1, arr[i]);
                }
            }
            //���Ĳ�ִ��sql
            rs=ps.executeQuery();
            List<Dishes> list=new ArrayList<Dishes>();
            while(rs.next()){
                Dishes dish=new Dishes();
                dish.setDishid(rs.getInt("dishid"));
                dish.setCuisines(rs.getString("cuisines"));
                dish.setDishname(rs.getString("dishname"));
                dish.setPrice(rs.getDouble("price"));
                dish.setPic(rs.getString("pic"));
                
                list.add(dish);
            }
            return list;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //�ر���Դ����������쳣
            BaseDao.close(con, ps, rs);
        }
        
        return null;
    }

    public static ArrayList<Dishes> getDataInfo() throws ClassNotFoundException{
    	Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Statement stmt = null;
        String sql="select * from REAPER.\"Dish\" where 1=1";
        ArrayList<Dishes> list=new ArrayList<Dishes>();
        try {
            con=BaseDao.getCon();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
            	Dishes dish=new Dishes();
                dish.setDishid(rs.getInt("dishid"));
                dish.setCuisines(rs.getString("cuisines"));
                dish.setDishname(rs.getString("dishname"));
                dish.setPrice(rs.getDouble("price"));
                dish.setPic(rs.getString("pic"));
                list.add(dish);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
    
    public static ArrayList<Dishes> search(String str) throws ClassNotFoundException{
    	Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Statement stmt = null;
        String sql="SELECT * FROM REAPER.\"Dish\" WHERE (\"cuisines\"||\"dishname\"||\"category\") LIKE '%"+str+"%'";
        System.out.println(sql); 
        ArrayList<Dishes> list=new ArrayList<Dishes>();
        try {
            con=BaseDao.getCon();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next())
            {
            	Dishes dish=new Dishes();
                dish.setDishid(rs.getInt("dishid"));
                dish.setCuisines(rs.getString("cuisines"));
                dish.setDishname(rs.getString("dishname"));
                dish.setPrice(rs.getDouble("price"));
                dish.setPic(rs.getString("pic"));
                list.add(dish);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
    
    
    public Dishes getDish(Integer id) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Statement stmt = null;
        try {
            con=BaseDao.getCon();//��һ���������ݿ�
            String sql="select * from REAPER.\"Dish\" where \"dishid\" = ";
            //ps=con.prepareStatement(sql);//�ڶ�����Ԥ����
            String id1=String.valueOf(id);
            sql=sql+id1;
            System.out.println(sql); 
            
            //ArrayList<Dishes> list=new ArrayList<Dishes>();
            con=BaseDao.getCon();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            //���Ĳ�ִ��sql
            
            while(rs.next()){
                Dishes dish=new Dishes();
                dish.setDishid(rs.getInt("dishid"));
                System.out.println(rs.getInt("dishid")); 
                dish.setCuisines(rs.getString("cuisines"));
                dish.setDishname(rs.getString("dishname"));
                dish.setPrice(rs.getDouble("price"));
                dish.setPic(rs.getString("pic"));
                
                return dish;
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //�ر���Դ����������쳣
            BaseDao.close(con, ps, rs);
        }
        
        return null;
    }


}
