package app;

import java.time.LocalDateTime;

public class Order {
	
	private int orderNo;
	private LocalDateTime orderDate;
	private double orderAmount;
	
	public Order(int orderNo, LocalDateTime orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
	
	
	

}
