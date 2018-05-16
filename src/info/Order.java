package info;
import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderId;// 订单编号
	private String ordername;// 订单名称
	private String name;// 收货人姓名
	private String address;// 收货人住址
	private String mobile;// 收货人手机
	private String totalPrice;// 总额
	private String createTime;//创建时间
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String string) {
		this.totalPrice = string;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
