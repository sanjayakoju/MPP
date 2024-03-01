package assignment.lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo implements BiFunction<Double, Double, List<Double>> {

	public static void main(String[] args) {
		BiFunctionDemo ob = new BiFunctionDemo();
		List<Double> rtnList = ob.apply(2.0, 3.0);
		System.out.println(rtnList);
		

		BiFunction<Double, Double, List<Double>> biFunction = (t, u) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(t, u));
			list.add((t * u));
			return list;
		};

		System.out.println(biFunction.apply(2.0, 3.0));
		
	}

	@Override
	public List<Double> apply(Double x, Double y) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList<>();
		list.add(Math.pow(x,y));
		list.add(x * y);
		return list;

	}
}
