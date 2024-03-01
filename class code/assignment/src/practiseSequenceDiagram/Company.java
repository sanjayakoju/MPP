package practiseSequenceDiagram;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String name;
	private List<Department> department;
	
	Company(String name, List<Department> dList) {
		this.name = name;
		this.department = new ArrayList<>();
		this.department.addAll(dList);
	}
	
	public double getSalary() {
		double sum = 0;
		for(Department d : department) {
			sum += d.getSalary();
		}
		return sum;
		
	}
}
