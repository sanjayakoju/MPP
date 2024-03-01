package streamPractise;

import java.util.stream.Stream;

public class GenrateAndIterator {

	public static void main(String[] args) {
		/**
		 *  Generator To Obtain Infinite Loop 
		 */
		Stream.generate(() -> "Java")
			.limit(5)
			.forEach(System.out::println);
		
		Stream<Double> random = Stream.generate((Math::random));
		Stream<Double> random1 = Stream.generate(( ) ->  Math.random());
//		random.limit(5)
//			  .forEach(System.out::println);
		
		Stream.generate((Math::random))
				.limit(5)
				.forEach(System.out::println);
		
		/**
		 *  Iterate to obtain infinite loop
		 */
		Stream<Integer> stream = Stream.iterate(1, x -> x + 1 );
		stream.limit(10)
			  .forEach(System.out::println);
		
		Stream.iterate(1, x -> x + 1)
				.limit(20)
				.skip(4)
				.forEach(System.out::println);
	}
}
