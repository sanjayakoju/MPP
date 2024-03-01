package prob11b;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLibrary {

    public static Predicate<? super Employee> filterEmpBy100KSalAndLastNameStartingN_Z = (employee) -> employee.getSalary() > 100000 && (employee.lastName.charAt(0) >= 'N' && employee.lastName.charAt(0) <= 'Z');

    public static final Function<? super Employee, ? extends String> funcGetEmployeeFullName = ((employee) -> employee.getFirstName() + " " + employee.getLastName());

    public static final Comparator<? super String> comparatorNaturalStringOrder = Comparator.comparing(s -> s);

}
