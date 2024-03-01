package assignment.lab8.prob2.A;


import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
		if (e1.name.compareTo(e2.name) == 0 && salaryComparator.compare(e1, e2) == 0) {
			return 0;
		}
		if (e1.name.compareTo(e2.name) == 0) {
			return salaryComparator.compare(e1, e2);
		}
		return e1.name.compareTo(e2.name);
	}
}
