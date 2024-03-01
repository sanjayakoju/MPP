package streamPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjaya", "Hari", "Omkar", "rahul");
		
	    Optional<String> found= names.stream()
			 .filter(name -> name.startsWith("S"))
			 .findFirst();
	    System.out.println(found.orElse("No Name Found!"));
	    
	   // Return value if found else nothing
	   found.ifPresent( n -> System.out.println(n));
	   
	   // Return Boolean 
	   System.out.println(found.isPresent());
	}
}
