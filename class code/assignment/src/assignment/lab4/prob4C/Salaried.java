package assignment.lab4.prob4C;



public class Salaried extends Employee {
    
	private final double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }
    @Override
    double calcGrossPay(int month, int year) {
        return salary;
    }
}
