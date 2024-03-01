package practise4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args)
	{
		// initialize array of Employees
		Employee[] employees = {
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("Indigo", "Indigo", 3587.5, "Sales"),
				new Employee("Indra", "Matthew", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")};

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);   //A method reference.
		
		//implement here
		
		//representing lambda as a static nested class
	
//		1) Print out only the first names of all the employees. 
		list.stream()
				.map(Employee::getFirstName).forEach(System.out::println);
		
//		2) Count the number of last names that begin with the letter ‘B’. Print out this number.
		Long count = list.stream()
				.filter(x -> x.getLastName().startsWith("B"))
				.map(Employee::getLastName)
				.count();
		System.out.println("Count : "+count);
		
//		3) Print out all the Employee objects whose last name begins with the letter ‘B’.
		list.stream()
				.filter(x -> x.getLastName().startsWith("B"))
				.forEach(System.out::println);
				
		System.out.println("============ 5 Ans ============ ");
				
//		4) Print out All of the employee objects, but if the last name begins with the letter ‘I’, then capitalize all the letters 
//		   in the last name.
	     list.stream()
         .map(employee -> {
             Employee e = new Employee(employee.getFirstName(),employee.getLastName(),employee.getSalary(),employee.getDepartment());
             if(e.getLastName().startsWith("I"))
                 e.setLastName(e.getLastName().toUpperCase());
             return e;
         })
         .forEach(System.out::println);
 System.out.println("======================================================================");
		
				list.stream()
				.filter(x -> x.getLastName().startsWith("I") )
				.map(x -> x.getLastName().toUpperCase())
				.forEach(System.out::println);
				
		System.out.println("============ 4 Ans ============ ");
				
//		5) Print out all the Employee objects’ last names, whose last name begins with the letter ‘I’, but First name does 
//		not begin with the letter ‘I’. Print out only the last names.
		list.stream()
			.filter(x -> x.getLastName().startsWith("I"))
			.filter(x -> !x.getFirstName().startsWith("I"))
			.map(Employee::getLastName)
			.forEach(System.out::println);
		
//		6) Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even 
//		numbers from this stream. 
		Stream<Integer> even = Stream.iterate(0, x -> x + 2);
		even.limit(20).collect(Collectors.toList()).forEach(System.out::println);
		
//		7) Display Employees with salaries in the range $4000-$6000
		list.stream()
			.filter(e -> e.getSalary() >= 4000 && e.getSalary() < 6000)
			.forEach(System.out::println);
		
		System.out.println("========================= 7 ===============");
		
//		8) Display Employees in IT department.
		list.stream()
			.filter(e -> e.getDepartment() == "IT")
			.forEach(System.out::println);
	}

   
//		
} // end class ProcessingEmployees

