package practise3;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private List<Person> pList;
	
	public Department(String name, List<Person> list) {
		this.name = name;
		this.pList = new ArrayList<>();
		this.pList = list;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getpList() {
		return pList;
	}
	public void setpList(List<Person> pList) {
		this.pList = pList;
	}
	
	
	public double getTotalSalary() {
		double sum = 0;
		for(Person p : pList) {
			Person pp = p;
			List<Role> rList = p.getRoleList();
			for(Role r: rList) {
				if (r instanceof Staff || r instanceof Faculty) {
					sum =sum+ r.getSalary();
				}
			}
		}
		return sum;
	}
	
	public void showAllMembers() {
		for(Person p: pList) {
			System.out.println(p);
		}
	}
	
	public void unitsPerFaculty() {
		for(Person p : pList) {
			List<Role> rList = p.getRoleList();
			for(Role r: rList) {
				if(r instanceof Faculty) {
					System.out.println("Name :"+p.getName() +" Units : "+r.getUnits());
				}
			}
			
		}
	}
}
