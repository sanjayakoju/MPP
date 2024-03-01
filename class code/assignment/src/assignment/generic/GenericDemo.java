package assignment.generic;

import java.util.List;

public class GenericDemo<T> {

	public static void main(String[] args) {
		
	}
	
	static <T, K> int count(T[] a, K b) {
		return 0;
	}
	
	static <T extends Comparable> T max1(List<T> list) {
		T[] arr = null; // This is ok so far
		//arr = new T[5]; // This produce a compiler error
		T n = (T) new Object();
		T max = list.get(0);
		for (T i: list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	
	// Generalizing Even Further
	static <T extends Comparable<T>> T max(List<T> list) {
		T[] arr = null; // This is ok so far
		//arr = new T[5]; // This produce a compiler error
		T n = (T) new Object();
		T max = list.get(0);
		for (T i: list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
}
