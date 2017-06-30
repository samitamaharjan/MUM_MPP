package lab4;

public abstract class Employee {
	private int empId;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void print(int month, int year) {
		System.out.println("EmployeeId : " + empId);
		calCompensation(month, year).print();
	}
	
	public Paycheck calCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		Paycheck payCheck = new Paycheck(grossPay, 23, 5, 1, 3, 7.5);
		return payCheck;
	}
	
	public abstract double calcGrossPay(int month, int year); 
}
