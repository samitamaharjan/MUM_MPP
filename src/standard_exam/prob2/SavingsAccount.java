package standard_exam.prob2;

public class SavingsAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String acctId;
	
	public SavingsAccount(String acctId, double fee, double startBalance) {
		this.acctId = acctId;
		this.monthlyFee = fee;
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
		return balance - monthlyFee;
	}
}
