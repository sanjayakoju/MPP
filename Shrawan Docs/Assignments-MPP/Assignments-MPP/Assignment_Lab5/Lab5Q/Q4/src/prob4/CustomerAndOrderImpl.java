package prob4;

public class CustomerAndOrderImpl implements CustomerAndOrder{

    private Customer customer;
    private Order order;

    public CustomerAndOrderImpl(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public Order getOrder() {
        return this.order;
    }
}
