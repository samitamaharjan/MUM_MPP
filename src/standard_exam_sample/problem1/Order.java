package standard_exam_sample.problem1;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	public Order(String orderNo, LocalDate orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public void setOrderNo(String s) {
		orderNo = s;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate
				+ ", orderAmount=" + orderAmount + "]";
	}
	
}
