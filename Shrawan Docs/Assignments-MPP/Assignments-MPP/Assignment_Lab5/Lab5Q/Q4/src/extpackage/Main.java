package extpackage;

import prob4.CustomerAndOrder;
import prob4.CustomerOrderFactory;
import prob4.Order;

public class Main {
	public static void main(String[] args) {

		CustomerAndOrder customerBob = CustomerOrderFactory
				.createCustomerOrder("Bob");
		Order order = customerBob.getOrder();

		order.addItem("Shirt");
		order.addItem("Laptop");

		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(customerBob.getCustomer().getOrders());
	}
}

		
