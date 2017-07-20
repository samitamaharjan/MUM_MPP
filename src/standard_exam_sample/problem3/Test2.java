package standard_exam_sample.problem3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

	static Employee[] arr = getAllEmployee();
	
	public static Employee[] getAllEmployee(){
		Employee[] es = new Employee[5];
		es[0] = new Employee("Alice", 3500, LocalDate.of(2011, 5, 10));
		es[1] = new Employee("Bob", 5000, LocalDate.of(2011, 5, 10));
		es[2] = new Employee("John", 8000, LocalDate.of(2011, 6, 10));
		es[3] = new Employee("Bob", 5000, LocalDate.of(2012, 5, 10));
		es[4] = new Employee("Zoe", 5600, LocalDate.of(2011, 7, 10));
		return es;
	}
	
	public static List<Employee> getEmployeeList1(){
		
		List<Employee> list = new ArrayList<Employee>();
		for(Employee e: arr){
			if (!list.contains(e))
				list.add(e);
		}
		return list;
	}
	
	public static MyEmployeeList getEmployeeList2(){
		MyEmployeeList myList = new MyEmployeeList();
		for(Employee e: arr){
			if(!myList.contains(e))
				myList.add(e);
		}
		return myList;
		
	}
	public static void main(String[] args) {
		System.out.println(getEmployeeList1().size());
		System.out.println(getEmployeeList2().size());
		System.out.println(getEmployeeList1().size()==getEmployeeList2().size());
	}
}
