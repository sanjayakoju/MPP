package assignment.lab2.prob2B;

public class Order {

	int totalOrder = 0;
	private int orderNum;
	private OrderLine orderLine;
	
	Order() {
		this.orderNum = ++totalOrder;
		this.orderLine = new OrderLine(this);
		
	}

	public int getOrderNum() {
		return orderNum;
	}


	public OrderLine getOrderLine() {
		return orderLine;
	}
	
	
}
