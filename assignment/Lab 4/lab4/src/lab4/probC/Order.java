package lab4.probC;

import java.time.LocalDate;

public class Order {
    private final int orderNo;
    private final LocalDate orderDate;
    private final double orderAmount;
    
    public int getOrderNo() {
        return orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }


    public Order(int orderNo, LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

}
