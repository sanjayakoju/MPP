package streamPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctAndSort {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard", "Tom", "Joseph");
		
		// Distinct
		words.stream()
			 .distinct()
			 .collect(Collectors.toList())
			 .forEach(System.out::println);
		
		System.out.println();
		
		// Sorted
		List<String> list = Arrays.asList("Tom", "Joseph", "Richard");
		Function<String, Integer> byLength = x -> x.length();
		list.stream()
//			.sorted((x,y) -> y.length() - x.length()) // Sorting Length
//			.sorted(Comparator.comparing(String::length).reversed()) // More Functional Style
			.sorted(Comparator.comparing(byLength).reversed().thenComparing(byLength)) // more intuitively
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		
	}
}
