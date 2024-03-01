package assignment.lab9PartTwo.prob9;

import java.util.stream.IntStream;

public class Square {
	public static void main(String[] args) {
		printStream(4);
	}
	
	public static void printStream(int num) {
		IntStream intStream = IntStream.iterate(1, n -> {
			int number = (int) Math.sqrt(n);
			n = (number + 1) * (number + 1);
			return n;
		}).limit(num);
		
		intStream.forEach(System.out::println);
	}
}