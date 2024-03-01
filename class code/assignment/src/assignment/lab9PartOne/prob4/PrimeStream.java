package assignment.lab9PartOne.prob4;

import java.util.stream.Stream;

public class PrimeStream {
	
	

	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}

	private void printFirstNPrimes(int i) {
//		final Stream<Integer> primes = 
				Stream.iterate(1, n -> n+1)
											.filter(PrimeStream::isPrime)
											.limit(i)
											.forEach(System.out::println);
//		primes.forEach(System.out::println);
	}
	
	 private static boolean isPrime(int number) {
	        if (number <= 1) return false;    //  1 is not prime and also not composite
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
