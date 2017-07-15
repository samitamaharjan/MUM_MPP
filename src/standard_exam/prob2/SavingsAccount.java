package standard_exam.prob2;

public class SavingsAccount extends Account{
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
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
		return balance + (interestRate * balance);
	}
}
