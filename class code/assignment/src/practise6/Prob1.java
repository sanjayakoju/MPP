package practise6;

import java.util.Random;
import java.util.function.Supplier;

public class Prob1 {
	Random random = new Random();

	// name and type of lambda goes here
	Supplier<Integer> r = () -> random.nextInt();
	
	// representing lambda as a method reference
	// Hint: To define the method reference, make use of a helper method
	Supplier<Integer> rr = random::nextInt;

	public static void main(String[] args) {
		Prob1 p = new Prob1();
		p.evaluator();
	}
	
	static class LamdhaStatic implements Supplier<Integer> {

		@Override
		public Integer get() {
			// TODO Auto-generated method stub
			Random random = new Random();
			return random.nextInt();
		}
		
	}

	
	public void evaluator() {
		System.out.println(rr.get());
		System.out.println(r.get());
		System.out.println(new LamdhaStatic().get());
	}
}
