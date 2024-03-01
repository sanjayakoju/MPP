package streamPractise;

import java.util.Arrays;
import java.util.List;

public class Min {
	
	public static <T extends Comparable<T>> int mins(List<T> list, T e) {
		int count = 0;
		for (T t: list) {
			if(t.compareTo(e) < 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,3,4,5,6,7,8);
		System.out.println(mins(list, 5));
	}

}
