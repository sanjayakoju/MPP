package practise4;

import java.util.function.BiFunction;

public class Prob1 {

	// name and type of lambda goes here
	// BiFunction and explicite arguments type
	BiFunction<String,String,Integer> biFunction = (String s1,String s2)->s1.compareTo(s2);
	
	// representing lambda as a method reference
	BiFunction<String,String,Integer> biFunction1 = String::compareTo;
	
	// representing lambda as a static nested class
	class CompareString implements BiFunction<String,String,Integer>{

	    @Override
	    public Integer apply(String s1, String s2) {
	        return s1.compareTo(s2);
	    }
	}
	// evaluate with String inputs: “Hello”, “Allo”
	public void evaluator() {
	    String firstTxt = "Hello";
	    String secondTxt = "Allo";
	    System.out.println(biFunction.apply(firstTxt,secondTxt));
	    System.out.println(biFunction1.apply(firstTxt,secondTxt));
	    System.out.println(new CompareString().apply(firstTxt,secondTxt));

	}
	public static void main(String[] args) {
		Prob1 p = new Prob1();
	    p.evaluator();
	}
}
