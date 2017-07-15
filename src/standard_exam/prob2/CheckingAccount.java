package standard_exam.prob2;

public class CheckingAccount extends Account{
	private double balance;
	private double interestRate;
	private String acctId;
	
	public CheckingAccount(String acctId, double interestRate, double startBalance) {
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = startBalance;
	}
	
	@Override
	String getAccountID() {
		return acctId;
	}

	@Override
	double getBalance() {
		return balance;
	}

	@Override
	double computeUpdatedBalance() {
		return balance * (1 - (interestRate / 100));
	}
}
