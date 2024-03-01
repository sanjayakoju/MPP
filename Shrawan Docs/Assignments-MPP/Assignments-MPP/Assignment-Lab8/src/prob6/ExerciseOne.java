package prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ExerciseOne {

    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;

    Function<Employee, String> employeeGetNameFun = Employee::getName;
    BiConsumer<Employee, String> employeeSetNameFun = Employee::setName;

    BiFunction<String, String, Integer> stringCompareToFunc = String::compareTo;
    BiFunction<Integer, Integer, Double> mathPowFunc = Math::pow;

    Function<Apple, Double> appleWeightFunc = Apple::getWeight;
    ToIntFunction<String> parseToIntegerFunc = Integer::parseInt;

    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee,Employee,Integer> empNameCompareFunc = comp::compare;


    public static void main(String[] args) {
        new ExerciseOne().evaluator();
    }

    void evaluator() {
        Employee employee1 = new Employee("Magician", 100000);
        Employee employee2 = new Employee("Sorcerer", 150000);

        System.out.println(toUpper1.apply("hello")); // HELLO

        ///test your other method references
        System.out.println(toUpper2.apply("hello")); // HELLO

        System.out.println(employeeGetNameFun.apply(employee1)); // Magician
        employeeSetNameFun.accept(employee1, "Wizard");

        System.out.println(stringCompareToFunc.apply("Arc", "Crystal")); // -2
        System.out.println(mathPowFunc.apply(4, 2)); // 16.0

        System.out.println(appleWeightFunc.apply(new Apple(20))); // 20.0
        System.out.println(parseToIntegerFunc.applyAsInt("0025")); // 25

        System.out.println(empNameCompareFunc.apply(employee1, employee2)); // 4
    }
}
