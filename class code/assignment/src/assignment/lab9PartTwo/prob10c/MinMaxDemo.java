package assignment.lab9PartTwo.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(21,34,1,34,12,325,32);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(x -> x));
		
		System.out.println("Min :"+summary.getMin());
		System.out.println("Max :"+summary.getMax());
	}
}
