package practise5;

import java.util.function.BiFunction;

public class Prob1 {

	// name and type of lambda goes here
	BiFunction<Integer, Integer, Boolean> biFunction = (Integer x, Integer y) -> x + y < x * y;
	
	// representing lambda as a method reference
    // Hint: To define the method reference, make use of a helper method.
	BiFunction<Integer, Integer, Boolean> compare = (Prob1::compareInt);
	
	// representing lambda as a static nested class
	static class LambdaStatic implements BiFunction<Integer, Integer, Boolean> {

		@Override
		public Boolean apply(Integer t, Integer u) {
			// TODO Auto-generated method stub
			return t + u < t * u;
		}
		
	}
	
	public static void main(String[] args) {
		Prob1 p = new Prob1();
		p.evaluator();
	}
	
	public void evaluator() {
		System.out.println(biFunction.apply(2, 2));
		System.out.println(compare.apply(2, 5));
		System.out.println(new LambdaStatic().apply(4, 4));
	}
	
	public static Boolean compareInt(Integer x, Integer y) {
		return x + y < x * y;
	}
}
