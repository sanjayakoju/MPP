package assignment.lab3.prob3;

public class Driver {

	public static void main(String[] args) {
		Address[] addresses = {
				new Address("111 Main", "Fairfield", "IA", "52556"),
				new Address("200 Forest Ave", "Fairfield", "IA", "52556"),
			    new Address("10 N. 4th St.", "Fairfield", "IA", "52556")
		};
		Object[] objects = { 
				new House( 1200.0), 
				new Condo(2), 
				new Trailer() 
		};
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
