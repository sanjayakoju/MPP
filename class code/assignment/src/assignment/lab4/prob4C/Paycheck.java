package assignment.lab4.prob4C;



public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    void print() {
    	System.out.println("Paychek:[ "+
    			"grossPay : "+grossPay+","+
    			"fica : "+fica+","+
    			"state : "+state+","+
    			"local : "+local+","+
    			"medicare : "+medicare+","+
    			"socialSecurity : "+socialSecurity+" ]");
    }

    double getNetPay() {
        return grossPay - grossPay * fica
                - grossPay * state
                - grossPay * local
                - grossPay * medicare
                - grossPay * socialSecurity;
    }
}
