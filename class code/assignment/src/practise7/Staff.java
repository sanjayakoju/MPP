package practise7;



public class Staff  extends Role{

	private double salary;
	
	Staff(double salary){
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public double getUnits() {
		return 0.0;
	}
}
