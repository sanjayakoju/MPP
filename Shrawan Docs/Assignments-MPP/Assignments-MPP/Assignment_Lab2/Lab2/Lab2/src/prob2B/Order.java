package prob2B;

public class Order {
	
	private static int totalOrder = 0;

	private int orderNum;
	private OrderLine orderLine;
	
	public Order() {
		this.orderNum = totalOrder++;
		this.orderLine = new OrderLine(this);
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public int getOrderNum() {
		return orderNum;
	}
	

}
