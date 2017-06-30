package lab4;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(int empId, double salary) {
		setEmpId(empId);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return getSalary();
	}
	
}
