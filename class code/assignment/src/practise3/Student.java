package practise3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Role {

	private double GPA;
	private List<Course> cList;
	
	public Student(double gpa, List<Course> clist) {
		this.GPA = gpa;
		this.cList = new ArrayList<>();
		this.cList = clist;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getUnits() {
		// TODO Auto-generated method stub
		double units = 0;
		for(Course c : cList) {
			units = units + getUnits();
		}
		return units;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public List<Course> getcList() {
		return cList;
	}

	public void setcList(List<Course> cList) {
		this.cList = cList;
	}

	@Override
	public String toString() {
		return "Student";
	}
	
	
}
