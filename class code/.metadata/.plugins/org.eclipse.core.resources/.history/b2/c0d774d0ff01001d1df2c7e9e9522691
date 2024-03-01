package streamPractise;

import java.util.stream.Stream;

public class ConcatString {

	public static void main(String[] args) {
		Stream<Character> c1 = Stream.of('H','e','l','l','o');
		Stream<Character> c2 = Stream.of('W','o','r','l','d');
		Stream<Character> c3 = Stream.concat(c1, c2);
		c3.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		Stream.concat(Stream.of("Sanjaya"), Stream.of("Koju"))
				.forEach(System.out::print);
	}
}
