package lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Character, Integer, String> NAMES_WITH_CRITERIA =
			(empList, initialChar, minSalary) -> empList.stream()
			.filter(emp -> emp.getLastName().charAt(0) > initialChar)
			.filter(emp -> emp.getSalary() > minSalary)
			.map(emp -> emp.getFirstName() + " " + emp.getLastName())
			.sorted()
			.collect(Collectors.joining(", "));
}
