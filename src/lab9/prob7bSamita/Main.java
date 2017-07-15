package lab9.prob7bSamita;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		String s = list.stream()
		.filter(emp -> emp.getLastName().matches("[N-Z].*"))
		.filter(emp -> emp.getSalary() > 100000)
		.map(emp -> emp.getFirstName() + " " + emp.getLastName())
		.sorted()
		.collect(Collectors.joining(", "));
		
		System.out.println(s);
		
		Criteria criteria = new Criteria(100000, 'N', 'Z');
		String str = MyLambdaLibrary.NAMES_WITH_CRITERIA.apply(list, criteria);
		System.out.println(str);
	}

}
