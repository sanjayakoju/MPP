package prob2B.extpackage;

import prob2B.Order;
import prob2B.OrderLine;

public class Main {
	
	public static void main(String[] args) {

		// CASE 1:  whenever an instance of A is created, an instance of B must also be created
		Order order = new Order();
		OrderLine orderLine = order.getOrderLine();
		
		orderLine.addItem("Student Bag");
		orderLine.addItem("Note Book");
		
		// CASE 2: each must contain instance of each other
		Order o = orderLine.getOrder();
		
		System.out.println(o.getOrderNum());
	}

}
