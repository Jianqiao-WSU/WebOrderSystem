package info;
import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderId;// �������
	private String ordername;// ��������
	private String name;// �ջ�������
	private String address;// �ջ���סַ
	private String mobile;// �ջ����ֻ�
	private String totalPrice;// �ܶ�
	private String createTime;//����ʱ��
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
