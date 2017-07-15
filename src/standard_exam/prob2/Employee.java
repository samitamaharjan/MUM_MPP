package standard_exam.prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> account;
	
	public Employee(String name) {
		this.name = name;
		account = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void addAccount(Account acct) {
		account.add(acct);
	}
	public double computeUpdatedBalanceSum() {
		double balance = 0;
		for (Account acct : account) {
			balance += acct.computeUpdatedBalance();
		}
		return balance;
	}
}
