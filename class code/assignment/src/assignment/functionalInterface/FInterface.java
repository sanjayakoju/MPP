package assignment.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FInterface{
	
	public static void main(String[] args) {
		
	}

	
	class ConsumerImpl implements Consumer<Integer> {

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub	
		}
		
	}
	
	class SupplierImpl implements Supplier<String> {

		@Override
		public String get() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class BiFunctionImpl implements BiFunction<Integer, Double, Double> {

		@Override
		public Double apply(Integer t, Double u) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class TriFunction implements TriFunctions<Integer, Double, Integer, Double> {

		@Override
		public Double apply(Integer s, Double t, Integer u) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class PredicateImpl implements Predicate<String> {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}