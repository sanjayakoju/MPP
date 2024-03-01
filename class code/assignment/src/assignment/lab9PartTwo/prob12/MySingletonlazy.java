package assignment.lab9PartTwo.prob12;

import java.util.Optional;

public class MySingletonlazy {
	private static MySingletonlazy instacne = null;
	private MySingletonlazy() {
		System.out.println("Created");
	}
	public static MySingletonlazy getinstance() {
//		if (instacne == null) {
//			instacne = new MySingletonlazy();
//		}
//		return instacne;
		
		return Optional.ofNullable(instacne).orElseGet(() -> {
			System.out.println("Object created ....");
			instacne = new MySingletonlazy();
			return instacne;
		});
	}
	
}
