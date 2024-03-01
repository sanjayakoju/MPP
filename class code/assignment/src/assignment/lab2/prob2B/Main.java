package assignment.lab2.prob2B;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		
		OrderLine orderLine = order.getOrderLine();
		orderLine.addItem("Laptop");
		orderLine.addItem("Monitor");
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getOrderLine());
	}
}
