package dao;

import info.Dishes;

/**
 * @author BieHongLi
 * @version 创建时间：2017年2月27日 上午10:40:53 
 * 购物项
 */
public class CartItem {

    private Dishes book;// 图书对象的成员变量
    private Integer number;// 购买的数量；

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
