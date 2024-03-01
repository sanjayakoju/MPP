package streamPractise;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1,2,3,4,5,6,7);
		Integer sum = digits.stream()
			  .reduce(0, (x,y) -> x+y);
		System.out.println("Sum : "+sum);
	}
}
