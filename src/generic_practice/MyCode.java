package generic_practice;

import java.util.List;

class MyCode {
 public static void main (String[] args) {
     Fte fte1 = new Fte("Samita", 12000);
     Contractor con1 = new Contractor("James", 65);
     
     Accounts.print(fte1);
     Accounts.print(con1);
 }
}

abstract class Employee {
 private String name;
 public abstract void printSalary();
 
 public Employee(String name) {
     this.name = name;
 }
 
 public String getName() {
     return this.name;
 }
}

class Fte extends Employee {
 private double monthlySalary;
 
 public Fte(String name, double monthlySalary) {
     super(name);
     this.monthlySalary = monthlySalary;
 }
 
 @Override
 public void printSalary() {
     System.out.println("Monthly salary: " + monthlySalary);
 }
 
 public double getMonthlySalary() {
     return this.monthlySalary;
 }
}

class Contractor extends Employee {
 private double hourlySalary;
 
 public Contractor(String name, double hourlySalary) {
     super(name);
     this.hourlySalary = hourlySalary;
 }
 
 @Override
 public void printSalary() {
     System.out.println("Hourly salary: " + hourlySalary);
 }

 public double getHourlySalary() {
     return this.hourlySalary;
 }
}

class Accounts {
 public static <T extends Employee> void print(T t) {
     System.out.println(t.getName());
     t.printSalary();
     // t.getMonthlySalary(); // Invalid
     // t.getHourlySalary(); // Invalid
 }
 
 public static <T> void copy(List<? extends T> source, List<? super T> destination) {
	 for (int i = 0; i < source.size(); i++) {
		 destination.set(i, source.get(i));
	 }
	 T t = source.get(0);
 }
}
