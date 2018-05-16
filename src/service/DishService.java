package service;

import java.util.List;

import info.Dishes;;

public interface DishService {

    /***
     * 图书信息查询的方法
     * @return
     */
    public List<Dishes> select(Dishes dish);
    
    /***
     * 根据id进行查询
     * @param id
     * @return
     */
    public Dishes getDish(Dishes dish);
}
