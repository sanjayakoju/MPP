package assignment.lab8.prob5;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
//		ForEachExample forEachExample = new ForEachExample();
//		list.forEach(forEachExample.new MyConsumer());
		list.forEach(str-> System.out.println(str.toUpperCase()));

		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
	}
	
	//implement a Consumer
	class MyConsumer implements Consumer<String>{

		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}

}