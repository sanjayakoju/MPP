package assignment.lab7.prob3;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		list.forEach(new MyConsumer());
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t.toLowerCase());
			}
		});
		
		ForEachExample ob = new ForEachExample();
		
		list.forEach(ob.consumer);
	}
	
	//implement a Consumer
	
	static class MyConsumer implements Consumer<String> {

		@Override
		public void accept(String t) {
			// TODO Auto-generated method stub
			System.out.println(t.toUpperCase());
		}
		
	}
	
	Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			// TODO Auto-generated method stub
			System.out.println(t.toUpperCase());
		}
	};
	
	
	
}