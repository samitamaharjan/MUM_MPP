package QuizJuly.lambdalib;

import java.util.List;

import QuizJuly.quizclasses.Employee;
import QuizJuly.quizclasses.EmployeeTestData;
import QuizJuly.quizclasses.TraderTransactTestData;
import QuizJuly.quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE USING A LAMBDA LIBRARY */
public class Main {
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//SAMPLE: Create a Lambda Library entry that prints all Employee records for 
		//which name has length > 5 and birth year is > 1970
		System.out.println(LambdaLibrary.SAMPLE.apply(sampleData, 5, 1970));
		
		prob1();
		prob2();
		prob3();
	}
	
		//Create a Lambda Library entry that does the following:
	    //Create a stream pipeline that obtains a list of
		//all name/salary pairs extracted from a list of Employees
		//for which salary > 55000 and less than 120000, in ascending
		//order of name, then descending order of salary
		//Then call your Lambda Library entry to print the list to the console
		public static void prob1() {
			//use this list 
			List<Employee> list = EmployeeTestData.getList();
			System.out.println(LambdaLibrary.EMPS.apply(list, 55000, 120000));
			
			/*List<Pair> str = list.stream().filter(emp -> emp.getSalary() > 55000 && emp.getSalary() < 120000)
						.map(emp -> new Pair(emp.getName(), emp.getSalary()))
						.sorted(Comparator.comparing((Pair::getKey).thenComparing(p -> -p.getValue()))
						.collect(Collectors.toList());
			System.out.println(str);*/
			// System.out.println(LambdaLibrary.IMPLEMENT);
			
		}
		//Create a Lambda Library entry that does the following:
		//Obtain a list of all transactions from year 2011 and 
		//sort them by value (small to high).
		//(Note: there is an instance variable "value" in Transaction)
		//Then call your Lambda Library entry to print the list to console
		public static void prob2() {
			//use this list	
			List<Transaction> list = TraderTransactTestData.getTransactions();
			System.out.println(LambdaLibrary.IMPLEMENT);
			
			System.out.println(LambdaLibrary.TRANS.apply(list, 2011));
		}
		
		// Create a Lambda Library entry that does the following:
		// Obtain a list of all traders from Cambridge, 
		// sort them by name. Then call your Lambda Library entry
		// to print to console
		public static void prob3() {
			//Use this list
			List<Transaction> list = TraderTransactTestData.getTransactions();  
			System.out.println(LambdaLibrary.IMPLEMENT);
			
			System.out.println(LambdaLibrary.TRADER.apply(list, "Cambridge"));
		                
		}
	
}


