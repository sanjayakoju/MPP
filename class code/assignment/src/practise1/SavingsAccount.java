package practise1;

public class SavingsAccount extends Account {
	
	private double balance;
	private double interestRate;
	private String accId;

	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}
	
	
	
	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public String getAccId() {
		return accId;
	}



	public void setAccId(String accId) {
		this.accId = accId;
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

}
