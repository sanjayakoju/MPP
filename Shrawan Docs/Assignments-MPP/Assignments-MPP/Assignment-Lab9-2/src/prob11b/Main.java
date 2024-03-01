package prob11b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

        String allFilteredEmpNamesString = list
                .stream()
                .filter(LambdaLibrary.filterEmpBy100KSalAndLastNameStartingN_Z)
                .map(LambdaLibrary.funcGetEmployeeFullName)
                .sorted(LambdaLibrary.comparatorNaturalStringOrder)
                .collect(Collectors.joining(", "));

        System.out.println(allFilteredEmpNamesString);

//        System.out.println(getEmpFullNameFilteredBySalAndLastNameStarting.apply(emps, 100000, "NZ".toCharArray()));

    }

//    testing Tri Function implementation for the stream logic
//    public static TriFunction<List<Employee>, Integer, char[], Stream<String>> getEmpFullNameFilteredBySalAndLastNameStarting = (employeeList, salaryThreshold, charsIn) -> {
//        return employeeList
//                .stream()
//                .filter(employee -> employee.getSalary() > salaryThreshold)
//                .filter(employee -> employee.getLastName().charAt(0) >= charsIn[0] && employee.getLastName().charAt(0) <= charsIn[1])
//                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
//                .sorted(Comparator.comparing(fullName -> fullName));
//    };

}
