package assignment.lab4.prob4C;



abstract public class Employee {
	
    private final String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    void print() {
        System.out.println("Employee:[empId:" + empId + "]");
    }

    abstract double calcGrossPay(int month, int year);

    public Paycheck calcCompensation(int month, int year) {
        return new Paycheck(calcGrossPay(month, year), 0.23, 0.05, 0.01, 0.03, 0.075);
    }
}
