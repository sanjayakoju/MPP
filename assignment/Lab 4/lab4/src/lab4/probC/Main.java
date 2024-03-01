package lab4.probC;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Salaried salaried = new Salaried("123", 1000);
        System.out.println("Gross Pay:"+salaried.calcGrossPay(1, 2022));
        salaried.calcCompensation(1, 2022).print();
        
        
        Commissioned commission = new Commissioned("1234",0.02,200);
        commission.addOrder(new Order(1, LocalDate.of(2022, 1, 12), 1200));
        commission.addOrder(new Order(2, LocalDate.of(2022, 1, 12), 600));
        commission.addOrder(new Order(3, LocalDate.of(2022, 1, 12), 300));
        commission.addOrder(new Order(4, LocalDate.of(2022, 1, 12), 900));
        System.out.println("Gross Pay:"+commission.calcGrossPay(2, 2022));
        commission.calcCompensation(2, 2022).print();
        
        
        Hourly hourly = new Hourly("12345",20.5,42);
        System.out.println("Gross Pay:"+hourly.calcGrossPay(1, 2022));
        hourly.calcCompensation(1, 2022).print();
    }
}
