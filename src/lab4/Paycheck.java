package lab4;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
				"GrossPay", "NetPay", "Fica", "State", "Local", "Medicare", "SocialSecurity"));
		sb.append(String.format("%-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n",
				grossPay, getNetPay(), fica, state, local, medicare, socialSecurity));
		System.out.println(sb.toString());
	}
	
	public double getNetPay() {
		return grossPay * (1 - ((fica + state + local + medicare + socialSecurity) / 100));
	}
}
