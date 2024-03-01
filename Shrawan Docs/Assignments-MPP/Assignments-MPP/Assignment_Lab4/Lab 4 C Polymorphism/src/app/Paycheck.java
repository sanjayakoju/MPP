package app;

public final class Paycheck {
	
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {
		System.out.println("Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity + "]");
	}
	
	public double getNetPay() {
		return 0;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	
	
	

}
