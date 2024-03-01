package streamPractise;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[] args) {
		System.out.println(sum(Arrays.asList(1,2,3,4)));
	}
	
	private static double sum(Collection<? extends Number> numbers) {
		double result = 0;
		for (Number num : numbers)
			result += num.doubleValue();
		
		return result;
		}
	
//	private static double sum1(Collection<? super Number> numbers) {
//		double result = 0.0;
//		for (Integer num : numbers)
//			result += num.doubleValue();
//		
//		return result;
//		}

}