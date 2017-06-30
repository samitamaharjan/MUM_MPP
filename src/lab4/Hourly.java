package lab4;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
		setEmpId(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek;
	}
	
}
