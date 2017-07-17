package standard_exam.sampleProblem;


// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // 1. Initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      
      List<Employee> list = Arrays.asList(employees);

      // 1. display all Employees using forEach [ 1 Points ]
      System.out.println("1. All Employees using forEach ");
      list.stream().forEach(System.out::println);
      
      // 2. Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary [ 3 Points ]
     System.out.println("2. Employees with salaries in the range $4000-$6000 sorted into ascending order by salary");
     list.stream().filter(emp -> emp.getSalary() > 4000 && emp.getSalary() < 6000)
     .sorted(Comparator.comparing(Employee::getSalary))
     .forEach(System.out::println);
           
      
      // 3. Comparator for comparing Employees by first name then last name [ 3 Points ]
     System.out.println("3. Comparator for comparing Employees by first name then last name");
     list.stream()
     .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
     .forEach(System.out::println);
      
      // 4. display unique employee last names in sorted order [ 3 Points ]
     System.out.println("4. display unique employee last names in sorted order");
     list.stream()
	     .map(emp -> emp.getLastName())
	     .distinct()
	     .sorted()
	     .forEach(System.out::println);
      
      // 5. group Employees by department to Map 
      // with Department name as a key and List of employees as values and print the result [ 4 Points ]
     System.out.println("5. group Employees by department to Map");
     Map<String, List<Employee>> map = list.stream()
    		 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
     
     System.out.println(map);

      // 6.Count number of Employees in each department to map with 
      // Department as key and department count as value and print the result [ 3 Points ]
    System.out.println("6.Count number of Employees in each department to map with Department as key and department count as value ");
     Map<String, Long> result = list.stream()
    		 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
     
     System.out.println(result);      
     
      // 7. calculate sum of Employee salaries with Stream reduce method [ 3 Points ]
     
      Double totalSalary = list.stream()
	      .map(emp -> emp.getSalary())
	      .reduce(0.0, Double::sum);
      
      System.out.println("7. The sum of Employee salaries :" + totalSalary);

      // 8. Find an employee who has the first name "Andy" in the list, 
  	//check null using Optional isPresent() or orElse to avoid NullPointerException [ 4 Points ]
      System.out.println("8. Find an employee who has the first name \"Andy\" in the list");
      Optional<Employee> findAndy = list.stream()
      	.filter(emp -> emp.getFirstName().equals("Andy"))
      	.findAny();
      if (findAndy.isPresent()) {
    	  System.out.println(findAndy);
      } else {
    	  System.out.println("Not found!!");
      }
      
      //9. Create an object using ClassName::new for the Employee class by defining your own Interface [ 3 Points ]
      System.out.println("9. Create an object using ClassName::new for the Employee class by defining your own Interface");
      MyInterface<String, String, Double, String, Employee> object = Employee::new;
      Employee newEmp = object.apply("Samita", "Maharjan", 80000.0, "IT");
      System.out.println(newEmp);
           
   /*10.  Create a lambda library for the given query and test it
   // Hint : Lambda Library, identify the parameters that are combined together 
    * in your pipeline, and consider those to be arguments for some kind of 
    * Java function-type interface [3 Points] */   
		System.out.println("10.  Create a lambda library for the given query ");
   			/*List<String> l2 = list.stream()
	   			.filter((x) -> x.getLastName().startsWith("I"))
	   			.peek(System.out::println)
	   			.map(Employee::getLastName)
	   			.sorted()
	   			.collect(Collectors.toList());*/
   			
   			//System.out.println(l2);
   			
   			System.out.println(LamdaLibrary.MYQUERY.apply(list, "I"));
      
   } // end main
} // end class ProcessingEmployees

 