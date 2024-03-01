package streamPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFilter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sasnjaya", "Koju", "Nepam", "Iowa", "Fairfield");
		
		// FIlter
		long c =list.stream()
			.filter(x -> x.length() > 5)
			.count();
		System.out.println("Count "+c);
		
		String s = "s";
		String d = "d";
		// Chained Filter
		long cc = list.stream()
					  .filter(x -> x.contains(""+s ))
					  .filter(x -> !x.contains(""+d ))
					  .filter(x -> x.length() > 4)
					  .count();
		System.out.println("Count : "+cc);
		
		List<String> list1 = Arrays.asList("Sasnjaya", "Koju", "Nepam", "Iowa", "Fairfield");

		// Map
		list.stream()
			.map(x -> x.toUpperCase())
			.forEach(System.out::println);
		
		// Map converting Integer to String list
		List<Integer> iList = Arrays.asList(1,2,3,4,5);
		List<String> strings = iList.stream()
				.map(x -> x.toString())
				.collect(Collectors.toList());
		System.out.println("Strings : "+strings);
		
		System.out.println("Flat Map");
		
		// Flat Map (One to many Mapping)
		Stream.of(1,2,3)
				.flatMap(n  -> Stream.of(n, n* n))
				.forEach(System.out::print);
	}
}