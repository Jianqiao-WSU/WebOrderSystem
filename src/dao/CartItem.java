package dao;

import info.Dishes;

/**
 * @author BieHongLi
 * @version ����ʱ�䣺2017��2��27�� ����10:40:53 
 * ������
 */
public class CartItem {

    private Dishes book;// ͼ�����ĳ�Ա����
    private Integer number;// �����������

    public Dishes getDish() {
        return book;
    }

    public void setDish(Dishes book) {
        this.book = book;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
