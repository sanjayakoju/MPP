package prob4E.sol;

public class SavingsAccount extends Account{
	
	private double balance;
	private double interestRate;
	private String acctId;
	

	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		super();
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}

	@Override
	public String getAccountID() {
		return this.acctId;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return this.balance + (this.interestRate * this.balance);
	}

}
