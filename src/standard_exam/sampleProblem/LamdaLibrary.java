package standard_exam.sampleProblem;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LamdaLibrary {	
	public static final BiFunction<List<Employee>, String, List<String>> MYQUERY 
		= (list, letter) -> list.stream()
			.filter((x) -> x.getLastName().startsWith(letter))
			.peek(System.out::println)
			.map(Employee::getLastName)
			.sorted()
			.collect(Collectors.toList());
}
