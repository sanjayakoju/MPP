package enumDemo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		double l1 = MyEnum.LENGTH.val;
		System.out.println(l1);
		System.out.println(Arrays.toString(MyEnum.values()));
		
		MyEnum med = MyEnum.MIDUM;
		System.out.println(med.val ); 
	}
}
