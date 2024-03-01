package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("users", "reuse", "reset", "setup");
        int countWords = countWords(stringList, 'u', 'p', 5); // users, reuse
        System.out.println(countWords);
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        long noOfWordsThatMatched = words.stream()
                .filter(s -> s.length() == len)
                .filter(s -> s.indexOf(c) != -1 && s.indexOf(d) == -1)
                .count();
        return (int) noOfWordsThatMatched;
    }

}
