package functionalInterface;

public class Main {
	
	static void display(int sum) {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		/** 
		 * 	Making Function as First class Citizen in Java
		 * 	Using Functional Interface and Lambda Expression
		 */
		Operation operation = (int a, int b) -> {
			int sum = a+b;
			return sum;
		};
		display(operation.sum(20, 30));
	}
}
