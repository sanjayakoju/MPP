package app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	
	private double commission;
	private double baseSalary;
	
	private List<Order> orderList = new ArrayList<>();

	@Override
	double calcGrossPay(int month, int yr) {
		double totalOrderAmount = 0;
		LocalDateTime prevMonthStartDate = LocalDateTime.of(yr, (month-1), 1, 0, 0);
		LocalDateTime currentMonthStartDate = LocalDateTime.of(yr, month, 1, 0, 0);
		
		for(Order o : orderList) {
			LocalDateTime orderDate = o.getOrderDate();
			if(orderDate.isAfter(prevMonthStartDate) && orderDate.isBefore(currentMonthStartDate)) {
				totalOrderAmount += o.getOrderAmount();
			}
		}
		return this.baseSalary + ((totalOrderAmount * this.commission) / 100);
	}
	
	public void addOrder(Order order) {
		this.orderList.add(order);
	}
	
	public List<Order> getOrder(Order order) {
		return this.orderList;
	}

}
