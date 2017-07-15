package lab9.prob7bSamita;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class MyLambdaLibrary {
	public static final BiFunction<List<Employee>, Criteria, String> NAMES_WITH_CRITERIA = 
			(empList, criteria) -> empList.stream()
			.filter(emp -> emp.getLastName().charAt(0) >= criteria.getLastNameLetterFrom())
			.filter(emp -> emp.getLastName().charAt(0) <= criteria.getLastNameLetterTo())
			.filter(emp -> emp.getSalary() > criteria.getMinSalary())
			.map(emp -> emp.getFirstName() + " " + emp.getLastName())
			.sorted()
			.collect(Collectors.joining(", "));
}

class Criteria {
	private int minSalary;
	private char lastNameLetterFrom;
	private char lastNameLetterTo;
	
	public Criteria(int minSalary, char lastNameLetterFrom, char lastNameLetterTo) {
		this.minSalary = minSalary;
		this.lastNameLetterFrom = lastNameLetterFrom;
		this.lastNameLetterTo = lastNameLetterTo;
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
}
