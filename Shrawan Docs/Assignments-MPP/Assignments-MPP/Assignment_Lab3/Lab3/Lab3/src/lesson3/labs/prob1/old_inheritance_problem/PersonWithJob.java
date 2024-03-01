package lesson3.labs.prob1.old_inheritance_problem;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	

	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		
		/*
		
		Note: The equals method, is designed in a way to compare with the another object of its own class.
		
		#. "Why p1.equals(p2) -> false " : We rely on PersonWithJob -> p1 equals method.
		
		The p1 is an instance of "PersonWithJob", and its equals method is designed to check both attributes. (name and salary)
		and it takes p2 as a comparison. However, p2 is an instance of "Person", which contains only name. They are DIFFERENT.
		
		
		#. "Why p2.equals(p1) -> true " : We rely on Person -> p2 equals method.
		
		The p2 is an instance of "Person", which contains only the name attribute.
		And it takes p1 -> PersonWithJob as a comparison object. 
		Here object p1 -> PersonWithJob class is derived from Person class, and hence when it cast it into Person object it only has name attribute.
		The name "Joe" is same and this evaluates to true.

		
		*/
		
	}


}
