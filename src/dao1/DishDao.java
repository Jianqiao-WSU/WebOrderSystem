package dao1;
import java.util.List;

import info.Dishes;
public interface DishDao {
    /***
     * 图书的查询的方法
     * @param sql
     * @param arr
     * @return
     */
    public List<Dishes> select(String sql,Object[] arr);
    
    /***
     * 按照图书编号进行查询
     * @param integer
     * @return
     */
    public Dishes getDish(Integer integer);
}
