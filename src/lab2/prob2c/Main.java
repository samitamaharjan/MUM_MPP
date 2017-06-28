package lab2.prob2c;

public class Main {

	public static void main(String[] args) {
		Section sec1 = new Section(1, new Student(105, "Samita"));
		sec1.addStudent(new Student(106, "Maria"));
		sec1.addStudent(new Student(107, "Phyo"));
		sec1.addStudent(new Student(108, "Madhuri"));
		
		System.out.println(sec1);
		
		Student st1 = new Student(201, "Alex");
		st1.addSection(sec1);
		
		System.out.println(sec1);
	}
}
