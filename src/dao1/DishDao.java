package dao1;
import java.util.List;

import info.Dishes;
public interface DishDao {
    /***
     * ͼ��Ĳ�ѯ�ķ���
     * @param sql
     * @param arr
     * @return
     */
    public List<Dishes> select(String sql,Object[] arr);
    
    /***
     * ����ͼ���Ž��в�ѯ
     * @param integer
     * @return
     */
    public Dishes getDish(Integer integer);
}
