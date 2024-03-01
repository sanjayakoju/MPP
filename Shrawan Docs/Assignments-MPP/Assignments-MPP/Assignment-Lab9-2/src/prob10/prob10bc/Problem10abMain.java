package prob10.prob10bc;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem10abMain {

    public static void main(String[] args) {

        // Problem 10 b
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        stringStream.forEach(s -> System.out.println(s));

        // Problem 10 c
        Stream<Integer> myIntStream = Stream.of(1, 5, 3, 4, 2);

        IntSummaryStatistics intSummaryStatistics = myIntStream.collect(Collectors.summarizingInt(value -> value));
        System.out.println("Max "+ intSummaryStatistics.getMax());
        System.out.println("Min "+ intSummaryStatistics.getMin());
    }

}
