





package lab3;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		
		//equals method is invoked on PersonWithJob because p1 is an instance of PersonWithJob. 
		//In this case, the argument aPerson is p2 which is an instance of Person and not PersonWithJob.
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		
		//equals method is invoked on Person because p2 is an instance of Person. In this case, argument p1 is 
		//also an instance of Person (through inheritance). So the comparison of name between two objects returns true
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
