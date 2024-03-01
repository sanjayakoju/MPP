package practise7;

import java.util.function.BiFunction;

public class Prob1 {
	
	// Expression (x,y) -> Math.pow(x,y)
	
	// name and type of lambda goes here
	BiFunction<Integer, Integer, Double> biFunction = (x,y) -> Math.pow(x, y);
	
	
	// Method reference
	BiFunction<Integer, Integer, Double> biFunctionB = Prob1::helper;
	
	// helper method
	static double helper(Integer x, Integer y) {
		return Math.pow(x, y);
	}
	
	// Static class implements biFunction
	static class LambdaStatic implements BiFunction<Integer, Integer, Double> {
		
		@Override
		public Double apply(Integer x, Integer y) {
			return Math.pow(x, y);
		}
	}
	
	
	public void evaluator() {
		System.out.println(biFunction.apply(2, 3));
		System.out.println(biFunctionB.apply(2, 3));
		System.out.println(new LambdaStatic().apply(2, 3));
	}
	

	public static void main(String[] args) {
		Prob1 ob = new Prob1();
		ob.evaluator();
		
	}
}
