package info;

public class Dishes {
    //实体类实现序列化，避免后面出现异常
    
    private Integer dishid;
    private String cuisines;
    private String dishname;
    private Double price;
    private String pic;
    public Integer getDishid() {
        return dishid;
    }
    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }
    public String getCuisines() {
        return cuisines;
    }
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }
    public String getDishname() {
        return dishname;
    }
    public void setDishname(String dishname) {
        this.dishname = dishname;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String toString() {
    	         return "Dish [dishid=" + dishid + ", cuisines=" + cuisines
    	                 + ", dishname=" + dishname + ", price=" + price + ", pic=" + pic + "]";
    	     }
}
