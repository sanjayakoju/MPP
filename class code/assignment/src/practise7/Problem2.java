package practise7;



import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Problem2 {
	
	// Checking Odd
	public static Predicate<Integer> oddP = i -> i % 2 != 0;
	
	// Checking palindromes
	public static Predicate<Integer> palindromP = t -> {
		
		 int r, sum = 0, temp;
         temp = t;
         while (t > 0) {
             r = t % 10;
             sum = (sum * 10) + r;
             t = t / 10;
         }
         return temp == sum;	
	};
	
	// Checking Prime
	public static Predicate<Integer> primeP = i -> {
		for(int j = 2;  j <= i/2; j++) {
			if(i % j == 0) return false;
		}
		return true;
	};
	
	// Declarative Style
	public static <T> int countIf(List<T> list, Predicate<T> p) {
        return (int)list.stream().filter(p).count();
    };
    
    // Imperative Style
    public static <T> int countIfI(List<T> list, Predicate<T> criteria){
        int count =0;
        for(T ele: list){
            if(criteria.test(ele)){
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(68, 11, 32, 515, 75);
	     
		 int count = Problem2.countIf(list, oddP);
	     System.out.println("Number of odd integers = " + count);
	     
	     count = Problem2.countIf(list, palindromP);
	     System.out.println("Number of Palindroms = " + count);
	     
	     count = Problem2.countIf(list, primeP);
	     System.out.println("Number of Prime numbers = " + count);

	     String arr[] = new String[5];
	     String a=new String("");
	     System.out.println(list.getClass().getComponentType());
	}

}
