package QuizJuly.innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import QuizJuly.quizclasses.Employee;
import QuizJuly.quizclasses.EmployeeTestData;
import QuizJuly.quizclasses.Trader;
import QuizJuly.quizclasses.TraderTransactTestData;
import QuizJuly.quizclasses.Transaction;



/**
 * SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE
 * SOLUTIONS WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {

		// SAMPLE: Use local inner classes to replace lambdas in your pipeline
		// solution to
		// this sample problem:
		// Print all Employee records for which name has length > 5 and birth
		// year is > 1970

		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();

		List<Employee> result = sampleData.stream().filter(new NameLength()).filter(new BirthYear())
				.collect(Collectors.toList());
		System.out.println(result);
		System.out.println();

		prob1();
		prob2();
		prob3();
	}

	// Transform your pipeline solution to prob1 in the pipeline package so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob1() {
		//use this list
		List<Employee> list = EmployeeTestData.getList();
				
		class FilterBySalary implements Predicate<Employee> {
			@Override
			public boolean test(Employee emp) {
				return emp.getSalary() > 55000 && emp.getSalary() < 120000;
			}
		}
		
		class SortedByNameSalary implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				if (diff == 0) {
					return e2.getSalary() - e1.getSalary();
				} 
				return diff;
			}
		}
		
		class DisplayInMap implements Function<Employee, String> {
			@Override
			public String apply(Employee emp) {
				return emp.getName() + " " + emp.getSalary();
			}
		}
		
		List<String> result = list.stream().filter(new FilterBySalary())
				.sorted(new SortedByNameSalary())
				.map(new DisplayInMap())
				.collect(Collectors.toList());
		
		System.out.println(result);
		System.out.println();

	}

	/// Transform your pipeline solution to prob2 so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob2() {
		// use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();
		
		class FilterByYear implements Predicate<Transaction> {
			@Override
			public boolean test(Transaction t) {
				return t.getYear() == 2011;
			}
		}
		
		class SortedByValue implements Comparator<Transaction> {
			@Override
			public int compare(Transaction t1, Transaction t2) {
				return t1.getValue() - t2.getValue();
			}
		}
		List<Transaction> result = list.stream()
				.filter(new FilterByYear())
				.sorted(new SortedByValue())
				.collect(Collectors.toList());
		System.out.println(result);
		System.out.println();
	}

	// Transform your pipeline solution to prob3 so that
	// every lambda is replaced by an instance of a
	// local inner class of the correct type
	public static void prob3() {
		// Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();
				
		Function<Transaction, Trader> mapToTrader = new Function<Transaction, Trader>() {
			@Override
			public Trader apply(Transaction t) {
				return t.getTrader();
			}
		};
		
		Predicate<Trader> filterByCity = new Predicate<Trader>() {
			@Override
			public boolean test(Trader trader) {
				return trader.getCity().equalsIgnoreCase("Cambridge");
			}
		};
		
		Comparator<Trader> sortedByName = new Comparator<Trader>() {
			@Override
			public int compare(Trader t1, Trader t2) {
				return t1.getName().compareTo(t2.getName());
			}
		};
		
		List<Trader> result = list.stream()
				.map(mapToTrader)
				.filter(filterByCity)
				.sorted(sortedByName)
				.collect(Collectors.toList());
		
		System.out.println(result);
		System.out.println();
	}
}
