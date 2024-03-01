package streamPractise;

import java.util.stream.LongStream;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		System.out.println(factorialStreams(number));
	}
	
	public static long factorialStreams(long n) {
//        return LongStream.rangeClosed(2, n)
//                .reduce(1, (long a, long b) -> a * b);
        
       return LongStream.range(1, n + 1).reduce(1, (a, b) -> (a * b));
    }
}
