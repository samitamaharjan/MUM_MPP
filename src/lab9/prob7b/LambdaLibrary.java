package lab9.prob7b;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final BiFunction<List<Employee>, Criteria, String> NAMES_WITH_CRITERIA = 
			(empList, criteria) -> empList.stream()
			.filter(emp -> emp.getLastName().charAt(0) >= criteria.getLastNameLetterFrom())
			.filter(emp -> emp.getLastName().charAt(0) <= criteria.getLastNameLetterTo())
			.filter(emp -> emp.getSalary() > criteria.getMinSalary())
			.sorted(Comparator.comparing(Employee::getLastName))
			.map(emp -> emp.getFirstName() + " " + emp.getLastName())
			.collect(Collectors.joining(", "));
	
}

class Criteria {
	private int minSalary;
	private char lastNameLetterFrom;
	private char lastNameLetterTo;
	private Employee emp;
	
	public Criteria(int minSalary, char lastNameLetterFrom, char lastNameLetterTo, Employee emp) {
		this.minSalary = minSalary;
		this.lastNameLetterFrom = lastNameLetterFrom;
		this.lastNameLetterTo = lastNameLetterTo;
		this.emp = emp;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public char getLastNameLetterFrom() {
		return lastNameLetterFrom;
	}

	public char getLastNameLetterTo() {
		return lastNameLetterTo;
	}

	public Employee getEmp() {
		return emp;
	}

}
