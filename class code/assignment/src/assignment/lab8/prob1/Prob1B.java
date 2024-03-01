package assignment.lab8.prob1;

import java.util.function.Supplier;

public class Prob1B {
	
	  // i
	Supplier<Double> doubleRanSupplier = Math::random; // method reference
    static Supplier<Double> supplier = () -> Math.random(); // or lambda expression

    public static void main(String[] args) {
    	Prob1B ob = new Prob1B();
        // ii
        System.out.println(supplier.get());
        RandomNumberGenerator generator =  new Prob1B().new RandomNumberGenerator();
        System.out.println(ob.doubleRanSupplier.get());
        System.out.println(generator.get());
    }

    /// iii
    class RandomNumberGenerator implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

}
