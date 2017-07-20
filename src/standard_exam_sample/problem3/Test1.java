package standard_exam_sample.problem3;

import java.time.LocalDate;


public class Test1 {

	public static void main(String[] args) {
		Employee e1= new Employee("Alice", 3500, LocalDate.of(2011, 5, 10));
		Employee e2= new Employee("Alice", 3500, LocalDate.of(2011, 6, 10));
		
		System.out.println("e1 equal to e2? " + e1.equals(e2));
		System.out.println("e1 equal to e2? " + (e1.compareTo(e2) == 0 ? true:false));
	}
	
}
