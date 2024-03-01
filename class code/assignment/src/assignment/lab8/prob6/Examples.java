package assignment.lab8.prob6;


import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {
	
	Employee emp = new Employee("Prabeen Soti",3563);
	Apple apple = new Apple(20.0);
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	Function<Employee,String> getName1 = (Employee e) -> e.getName();
	Function<Employee, String> getName2 = Employee::getName;
	
	BiConsumer<Employee, String> setName1 = (Employee e,String s) -> e.setName(s);
	BiConsumer<Employee,String> setName2 = Employee::setName;
	
	BiFunction<String, String, Integer> stringCompare1 = (String s1,String s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> stringCompare2 = String::compareTo;
	
	BiFunction<Double, Double, Double> power1 = (Double x,Double y) -> Math.pow(x,y);
	BiFunction<Double, Double, Double> power2 = Math::pow;
	
	Function<Apple,Double> appleWeight1 = (Apple a) -> a.getWeight();
	Function<Apple,Double> appleWeight2 = Apple::getWeight;
	
	Function<String,Integer> intConvert1 = (String x) -> Integer.parseInt(x);
	Function<String,Integer> intConvert2 = Integer::parseInt;
	
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> enc1 = (Employee e1, Employee e2) -> comp.compare(e1,e2);
	Comparator<Employee> enc2 =  comp::compare;
	
	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		System.out.println(getName1.apply(emp));
		System.out.println(getName2.apply(emp));
		
		setName1.accept(emp, "Prabeen");
		System.out.println(emp.getName());
		setName2.accept(emp, "Ram");
		System.out.println(emp.getName());
		
		System.out.println(stringCompare1.apply("abc", "abc"));
		System.out.println(stringCompare2.apply("abc", "abc"));
		
		System.out.println(power1.apply(2.0, 3.0));
		System.out.println(power2.apply(2.0, 3.0));
		
		System.out.println(appleWeight1.apply(apple));
		System.out.println(appleWeight2.apply(apple));
		
		System.out.println(intConvert1.apply("34"));
		System.out.println(intConvert2.apply("34"));
		
		System.out.println(enc1.compare(emp, emp));
		System.out.println(enc1.compare(emp,new Employee("Prabeen Soti",3563)));

	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
