package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import info.Dishes;
import dao.BaseDao;
import dao.DishDao;
import dao.DishDaoImpl;
import service.DishService;

public class DishServiceImpl  implements DishService{

private DishDao dao=new DishDaoImpl();
    
    public List<Dishes> select(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where 1=1 ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
            /*list.add(book.getBookname());
            list.add(book.getPrice());
            list.add(book.getAuthor());
            list.add(book.getPic());
            list.add(book.getPublish());*/
        }
        return dao.select(sql.toString(), list.toArray());
    }

    public List<Dishes> selectLU(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='¬≥≤À' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> selectChuan(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='¥®≤À' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> selectHuai(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='ª¥—Ô≤À' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> selectYue(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='‘¡≤À' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> selectTian(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='Ãµ„' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> selectWest(Dishes book){
        //String sql="select * from book ";
        StringBuilder sql=new StringBuilder("select * from REAPER.\"Dish\" where \"cuisines\"='Œ˜≤Õ' ");
        //sql”Ôæ‰
        System.out.println(sql); 
        List<Object> list=new ArrayList<Object>();
        if(book!=null){
        	System.out.println(sql); 
            if(book.getDishid()!=null){
                sql.append(" and dishid=? ");
                System.out.println(book.getDishid()); 
                list.add(book.getDishid());
            }
        }
        return dao.select(sql.toString(), list.toArray());
    }
    
    public List<Dishes> search(String str) throws ClassNotFoundException{
    	Connection con=null;
        ResultSet rs=null;
        Statement stmt = null;
        String sql="SELECT * FROM REAPER.\"Dish\" WHERE (\"cuisines\"||\"dishname\"||\"category\") LIKE '%"+str+"%'";
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
    
    @Override
    public Dishes getDish(Dishes book) {
        if(book.getDishid()!=null){
        	System.out.println("54654"+book.getDishid()); 
            return dao.getDish(book.getDishid());
        }
        return null;
    }

    
}