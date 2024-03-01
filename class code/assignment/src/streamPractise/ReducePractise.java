package streamPractise;

import java.util.Optional;
import java.util.stream.Stream;

public class ReducePractise {
	public static void main(String[] args) {
		Stream <String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		Optional<String> st = strings.reduce((st1,st2) -> st1 +" "+ st2);
		st.ifPresent(System.out::println);
//		System.out.println(strings.reduce((st1,st2) -> st1 +" "+ st2));
	}
}
