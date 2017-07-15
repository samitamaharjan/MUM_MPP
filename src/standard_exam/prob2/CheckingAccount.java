package standard_exam.prob2;

public class CheckingAccount extends Account{
	private double balance;
	private double MonthlyFee;
	private String acctId;
	
	public CheckingAccount(String acctId, double fee, double startBalance) {
		this.acctId = acctId;
		this.MonthlyFee = fee;
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
		return balance - MonthlyFee;
	}
}
