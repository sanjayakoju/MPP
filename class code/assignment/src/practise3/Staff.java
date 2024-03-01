package practise3;

import java.util.List;

public class Staff extends Role {

	private double salary;
	
	public Staff(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public double getUnits() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
	
	
}
