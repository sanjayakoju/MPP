package practise1;

public class CheckingAccount extends Account {
	
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accountId, double fee,double startBalance) {
		this.accId = accountId;
		this.monthlyFee = fee;
		this.balance = startBalance;
	}
	
	

	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getMonthlyFee() {
		return monthlyFee;
	}



	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
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
		return balance - monthlyFee;
	}
	
	

}
