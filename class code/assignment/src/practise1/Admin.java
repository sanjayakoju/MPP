package practise1;



import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double sum = 0;
		for(Employee employee: list) {
			if(employee!= null) {
				sum = sum + employee.computeUpdatedBalanceSum();
			}
		}
		return sum;
	}
}
