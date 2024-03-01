package streamPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WordCount {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "Don Net", "PHP", "WAP");
		
		// Functional Style Solution
		long count = words.stream()
							.filter(x -> x.length() >3)
							.count();
		System.out.println(count);
		
		Integer arr [] = {1,3,5,7,6};
		Stream<Integer> stream = Stream.of(arr);
		
		int arr1[] = {13,5,7,8};
		Stream<int[]> stream1 = Stream.of(arr1);
		
		System.out.println(stream.reduce(0,(x,y) -> x + y));
	}
}
