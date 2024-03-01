package app;

public class Salaried extends Employee{

	private double salary;

	@Override
	double calcGrossPay(int month, int yr) {
		return salary;
	}

}
