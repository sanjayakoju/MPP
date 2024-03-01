package app;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private double hoursPerWeek;


	@Override
	double calcGrossPay(int month, int yr) {
		return (this.hoursPerWeek * 4) * this.hourlyWage;
	}

}
