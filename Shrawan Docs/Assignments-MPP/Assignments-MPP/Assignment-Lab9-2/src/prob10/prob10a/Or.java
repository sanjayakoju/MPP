package prob10.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

		System.out.println(new Or().someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {

		Boolean aBoolean = list
				.stream()
				.map(simple -> simple.flag)
				.reduce(false, (boolAcc, flag) -> boolAcc || flag);

		return aBoolean;
	}

}
