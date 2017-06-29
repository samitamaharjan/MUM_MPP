package lab3_composition;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(Person person, double s) {
		salary = s;
		this.person = person;
	}	
	
	public Person getPerson() {
		return person;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getPerson().equals(p.getPerson()) && this.getSalary() == p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Joe");
		PersonWithJob p2 = new PersonWithJob(p1, 30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
