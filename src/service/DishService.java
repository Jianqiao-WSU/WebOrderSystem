package service;

import java.util.List;

import info.Dishes;;

public interface DishService {

    /***
     * ͼ����Ϣ��ѯ�ķ���
     * @return
     */
    public List<Dishes> select(Dishes dish);
    
    /***
     * ����id���в�ѯ
     * @param id
     * @return
     */
    public Dishes getDish(Dishes dish);
}
