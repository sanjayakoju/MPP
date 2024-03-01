package lesson9.labs.prob4;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {

    // A: final variable Stream<Integer> primes
    final Supplier<Stream<Integer>> primesStream = () -> Stream.iterate(1, (currNumber) -> {
        int nextPrime = currNumber + 1;
        int i = 2;
        while (i <= nextPrime/2) { // keep on trying up to nextPrime/2
            // if divisible, try for nextPrime + 1, and reset i = 2;
            if(nextPrime % i == 0) {
                nextPrime = nextPrime + 1;
                i = 2;
            }
            i++;
        }
        return nextPrime;
    });

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);


    }

    public void printFirstNPrimes(long n) {
        primesStream.get()
                .limit(n)
                .forEach(integer -> System.out.println(integer));
    }
}
