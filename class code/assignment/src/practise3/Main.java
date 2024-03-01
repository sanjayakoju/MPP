package practise3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course(1, "FPP", 30);
		Course c2 = new Course(2, "MPP", 40);
		
		List<Course> clist1 = new ArrayList<>();
		clist1.add(c1);
		clist1.add(c2);
		
		List<Course> clist = new ArrayList<>();
		clist.add(c1);
		
		Faculty f1 = new Faculty(12000, clist);
		Faculty f2 = new Faculty(12000, clist1);
		
		List<Role> rList = new ArrayList<>();
		rList.add(f1);
		
		List<Role> rList1 = new ArrayList<>();
		rList1.add(f1);
		rList1.add(f2);
		
		Person p1 = new Person("Ram", "235636", 31, rList);
		Person p2 = new Person("Prabin", "234535636", 32, rList1);
		List<Person> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
		
		Department d1 = new Department("MSCS", plist);
		System.out.println(d1.getTotalSalary());
		d1.showAllMembers();
		d1.unitsPerFaculty();
	}
}
