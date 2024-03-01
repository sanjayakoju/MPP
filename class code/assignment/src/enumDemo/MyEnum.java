package enumDemo;

public enum MyEnum {

	LENGTH(1.0, "A"), WIDTH(2.0, "B "),
	MIDUM;
	double val;
	String s;
	
	private MyEnum() {
		// TODO Auto-generated constructor stub
	}
	MyEnum(double d, String s) {
		this.val = d;
		this.s = s;
	}
	
	public double val() {
		return val;
	}
}
