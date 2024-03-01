package prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
        //expected output: [0, -1, -2, -3, -4, 4, -5, 5]
        ordering1(intList);
        List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
        //expected output: [cba, fie, doe, efg, set]
        ordering2(stringList);

    }

    //Orders the integers according to this pattern:
    // 0, -1, 1, -2, 2, -3, 3, . . .
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering1(List<Integer> list) {
        List<Integer> listSortedIntegers = list.stream()
                .sorted((i1, i2) -> {
                    int int1 = Math.abs(i1);
                    int int2 = Math.abs(i2);
                    int compareResult = int1 == int2 ? i1 < i2 ? -1 : 1 : Integer.compare(int1, int2);
                    return compareResult;
                }).collect(Collectors.toList());
        System.out.println(listSortedIntegers);

    }

    //Orders words by first reversing each and comparing
    //in the usual way.  So
    //    cba precedes bed
    //since
    //    cba.reverse() precedes bed.reverse()
    //in the usual ordering
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering2(List<String> words) {

        List<String> orderedRevWords = words.stream()
                .sorted(Comparator.comparing((String s) -> new StringBuilder(s).reverse()))
                .collect(Collectors.toList());
        System.out.println(orderedRevWords);


    }

}
