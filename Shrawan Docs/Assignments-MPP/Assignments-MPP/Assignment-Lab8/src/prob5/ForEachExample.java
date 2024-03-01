package prob5;

import java.util.Arrays;
import java.util.List;


public class ForEachExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        list.forEach(s -> ForEachExample.printInUpperCase(s)); // lambda expression

        list.forEach(ForEachExample::printInUpperCase); // method reference

    }

    public static void printInUpperCase(String inputString) {
        System.out.println(inputString.toUpperCase());
    }


}