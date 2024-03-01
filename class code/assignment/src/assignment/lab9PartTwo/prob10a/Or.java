package assignment.lab9PartTwo.prob10a;


import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or ob = new Or();
		
		System.out.println(ob.someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
		
		return list.stream().map(x -> x.flag).reduce((x,y) -> x || y).get() ;
	}

}
