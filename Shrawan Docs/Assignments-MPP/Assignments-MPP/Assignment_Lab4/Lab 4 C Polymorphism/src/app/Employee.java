package app;

public abstract class Employee {

	long empId;

	public void print() {
		System.out.println("Employee id:" + getEmpId());
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double totalGrossPay = calcGrossPay(month, year);
		double fica = totalGrossPay - ((23 * totalGrossPay) / 100 ) ;
		double stateTax = totalGrossPay - ((5 * totalGrossPay) / 100 );
		double localTax = totalGrossPay - ((1 * totalGrossPay) / 100 );
		double medicare = totalGrossPay - ((3 * totalGrossPay) / 100 );
		double ssn = totalGrossPay - ((7.5 * totalGrossPay) / 100 );
		Paycheck paycheck = new Paycheck(totalGrossPay, fica, stateTax, localTax, medicare, ssn);
		return paycheck;
		
	}
	
	abstract double calcGrossPay(int month, int yr);

	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
}
