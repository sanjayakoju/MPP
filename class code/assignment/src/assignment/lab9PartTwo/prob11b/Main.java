package assignment.lab9PartTwo.prob11b;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(LambdaLibrary.EMPLOYEE_FILTER.apply(list, 100000.0, 'M'));
		
		System.out.println(filterByLastName.apply(list, 100000));
		
		   String allFilteredEmpNamesString = list
	                .stream()
	                .filter(LambdaLibrary.filterEmpBy100KSalAndLastNameStartingN_Z)
	                .map(LambdaLibrary.funcGetEmployeeFullName)
	                .sorted(LambdaLibrary.comparatorNaturalStringOrder)
	                .collect(Collectors.joining(", "));

	        System.out.println(allFilteredEmpNamesString);
	}
	
	public static final BiFunction<List<Employee>, Integer, List<String>> filterByLastName = (list, salary) -> list.stream()
	.sorted(Comparator.comparing(Employee::getFirstName))
	.filter(e -> e.getSalary() > salary)
	.filter(e -> e.getLastName().charAt(0) > 'M')
	.map(e -> e.getFirstName() + " " + e.getLastName())
	.collect(Collectors.toList());


}
