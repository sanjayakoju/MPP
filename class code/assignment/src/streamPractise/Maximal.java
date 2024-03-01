package streamPractise;

import java.util.Arrays;
import java.util.List;

public class Maximal {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(50, 8, 4, 9, 11, 25, 1, 19, 7, 29);
		System.out.println(max(list, 2, 6));
	}

	static <T extends Comparable<T>> T max(List<T> lists, int b, int e) {
		
		T max = lists.get(b);
		
		for (int i = b; i <= e; i++) {
			if (lists.get(i).compareTo(max) > 0) {
				max = lists.get(i);
			}
		}

		return max;
	}
}