package prob4;

import java.time.LocalDate;

public class CustomerOrderFactory {

    public static CustomerAndOrder createCustomerOrder(String customerName) {
        Customer customer = new Customer(customerName);
        Order order = Order.newOrder(customer, LocalDate.now());
        return new CustomerAndOrderImpl(customer, order);
    }
}
