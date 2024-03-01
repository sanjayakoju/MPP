package practise1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private List<Account> account;
	public Employee(String name) {
		this.name = name;
		this.account = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct) {
		account.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double sum = 0;
		for(Account acc: account) {
			if(acc != null) {
				sum = sum + acc.computeUpdatedBalance();
			}
		}
		return sum;
	}
}
