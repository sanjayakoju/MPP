package prob2.declarative;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Declarative {

	public static <T> int helperCount(Collection<T> list, Predicate<T> predicate) {

		return (int) list.stream().filter(predicate).count();

	}

	public static void main(String[] args) {

		Predicate<Integer> oddNumberPredicate = t -> t % 2 != 0;

		Predicate<Integer> primeNumberPredicate = t -> {
			int count = 0;
			for (int i = 1; i <= t; i++) {
				if (t % i == 0) {
					count++;
				}
			}
			return count == 2;
		};

		Predicate<Integer> palindromePredicate = t -> {
			int r, sum = 0, temp;
			temp = t;
			while (t > 0) {
				r = t % 10;
				sum = (sum * 10) + r;
				t = t / 10;
			}
			return temp == sum;

		};

		Collection<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 848);

		int countOdd = helperCount(list, oddNumberPredicate);

		System.out.println("Total odd number in give list is :: " + countOdd);

		int countPrime = helperCount(list, primeNumberPredicate);

		System.out.println("Total prime number in give list is :: " + countPrime);

		int countPalindrome = helperCount(list, palindromePredicate);

		System.out.println("Total palindromes in give list is :: " + countPalindrome);
	}

}
