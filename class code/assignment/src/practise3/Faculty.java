package practise3;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Role {

	private double salary;
	private List<Course> clist;
	
	public Faculty(double salary, List<Course> cList) {
		this.salary = salary;
		this.clist = new ArrayList<>();
		this.clist = cList;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public double getUnits() {
		// TODO Auto-generated method stub
		double units =0;
		for(Course c : clist) {
			units = units + c.getUnit();
		}
		return units;
	}

	public List<Course> getClist() {
		return clist;
	}

	public void setClist(List<Course> clist) {
		this.clist = clist;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty";
	}

	
	
	
}
