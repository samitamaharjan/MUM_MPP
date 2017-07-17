package QuizJuly.lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import QuizJuly.quizclasses.Employee;
import QuizJuly.quizclasses.Trader;
import QuizJuly.quizclasses.Transaction;

public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());
	   
	 public final static TriFunction<List<Employee>, Integer, Integer, List<String>> EMPS
	 = (list, minSal, maxSal) -> list.stream()
	 .filter(emp -> emp.getSalary() > minSal && emp.getSalary() < 120000)
	 .sorted(Comparator.comparing(Employee::getName).thenComparing(emp -> -emp.getSalary()))
	 .map(emp -> emp.getName() + " " + emp.getSalary())
	 .collect(Collectors.toList());
	 
	 public static final BiFunction<List<Transaction>, Integer, List<Transaction>> TRANS 
	 = (list, year) -> list.stream().filter(t -> t.getYear() == year)
		.sorted(Comparator.comparing(Transaction::getValue))
		.collect(Collectors.toList());
	 
	 public static final BiFunction<List<Transaction>, String, List<Trader>> TRADER 
	 = (list, city) -> list.stream()
	 .map(t -> t.getTrader())
	 .filter(trader -> trader.getCity().equalsIgnoreCase(city))
	 .collect(Collectors.toList());
}
