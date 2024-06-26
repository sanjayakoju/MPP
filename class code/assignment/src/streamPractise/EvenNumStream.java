package streamPractise;

import java.math.BigInteger;
import java.util.stream.Stream;

public class EvenNumStream {

	public static void main(String[] args) {
		evenNumber(10);	
	}	
	
	static void evenNumber(int n) {
		Stream<BigInteger> stream = Stream.iterate(BigInteger.ZERO, x -> x.add(BigInteger.TWO));
		stream.limit(n)
				.forEach(System.out::println);
	}
	
}
