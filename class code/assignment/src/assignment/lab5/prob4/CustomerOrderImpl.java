package assignment.lab5.prob4;

public class CustomerOrderImpl implements CustomerAndOrder {
	
	 private Customer customer;
	    private Order order;

	    public CustomerOrderImpl(Customer customer, Order order) {
	        this.customer = customer;
	        this.order = order;
	    }

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return this.customer;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return this.order;
	}

}
