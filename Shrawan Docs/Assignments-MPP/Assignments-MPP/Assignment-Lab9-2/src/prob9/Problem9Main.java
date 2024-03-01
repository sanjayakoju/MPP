package prob9;

import java.util.stream.IntStream;

public class Problem9Main {

    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream
                .iterate(1, currentValue -> {
                    double prevSqrtNumber = Math.sqrt(currentValue);
                    return (int) Math.pow(prevSqrtNumber + 1, 2);
                })
                .takeWhile(currentValue -> Math.pow(num, 2) >= currentValue)
                .forEach(value -> System.out.println(value));
    }
}
