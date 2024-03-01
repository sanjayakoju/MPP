package prob4E;

import java.util.ArrayList;
import java.util.List;

import prob4E.sol.Account;

public class Employee {
	
	private String name;
	private List<Account> accountList = new ArrayList<>();
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}


	public double computeUpdatedBalanceSum() {
		double totalBalance = 0;
		for(Account account: accountList) {
			totalBalance += account.getBalance();
		}
		return totalBalance;
	}


	public String getName() {
		return name;
	}


	public List<Account> getAccountList() {
		return this.accountList;
	}


	public void addAccount(Account account) {
		this.accountList.add(account);
	}
	
	
	
}
