package lab4.probC;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends  Employee {

    private final List<Order> orders;
    private final double commision;
    private final double baseSalary;

    public Commissioned(String empId, double commision, double baseSalary) {
        super(empId);
        this.commision = commision;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }
    
    @Override
    double calcGrossPay(int month, int year) {
        LocalDate now = LocalDate.of(year,month,1);
        LocalDate previousMonth = now.minusMonths(1);
        double totalOrderInPreviousMonth = 0;
        for (Order order: orders) {
            if (now.isAfter(order.getOrderDate()) && previousMonth.isBefore(order.getOrderDate())) {
                totalOrderInPreviousMonth += order.getOrderAmount();
            }
        }
        return baseSalary + totalOrderInPreviousMonth * commision;
    }

    void addOrder(Order order) {
        this.orders.add(order);
    }
}
