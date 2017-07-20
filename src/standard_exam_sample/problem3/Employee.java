package standard_exam_sample.problem3;

import java.time.LocalDate;
import java.util.Arrays;


public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private LocalDate hireDate;
	public Employee(String n, int s, LocalDate hireDate) {
		this.name = n;
		this.salary = s;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public int compareTo(Employee o) {
		if (this.name.compareTo(o.name)!=0)
			return this.name.compareTo(o.name);
		else 
			return this.salary-o.salary;
					
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;	
		return this.name.equals(e.name) && this.salary == e.salary && this.hireDate.equals(e.hireDate);
	}
	
}

