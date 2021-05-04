package Entities;

public class Order implements Entity {
	private String orderId;
	private String orderDetail;
	
	private Order() {
		
	}

	public Order(String orderId, String orderDetail) {
		super();
		this.orderId = orderId;
		this.orderDetail = orderDetail;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}
}
