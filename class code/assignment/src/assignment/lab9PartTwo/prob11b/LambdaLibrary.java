package assignment.lab9PartTwo.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLibrary {

	 public static Predicate<? super Employee> filterEmpBy100KSalAndLastNameStartingN_Z = (employee) -> employee.getSalary() > 100000 && (employee.lastName.charAt(0) >= 'N' && employee.lastName.charAt(0) <= 'Z');

	 public static final Function<? super Employee, ? extends String> funcGetEmployeeFullName = ((employee) -> employee.getFirstName() + " " + employee.getLastName());

	 public static final Comparator<? super String> comparatorNaturalStringOrder = Comparator.comparing(s -> s);

	 public static final TriFunction<List<Employee>, Double, Character, List<String>> EMPLOYEE_FILTER = (list, salary,
				value) -> {
			return list.stream().sorted(Comparator.comparing(Employee::getFirstName))
					.filter(employee -> employee.getSalary() > salary)
					.filter(employee -> employee.getLastName().charAt(0) > value)
					.map(employee -> employee.getFirstName() + " " + employee.getLastName()).collect(Collectors.toList());
		};

}