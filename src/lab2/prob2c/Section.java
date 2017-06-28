package lab2.prob2c;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private int sectionNum;
	private List<Student> students;
		
	public Section(int sectionNum, Student st) {
		this.sectionNum = sectionNum;
		students = new ArrayList<Student>();
		addStudent(st);
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student st) {
		students.add(st);
		st.getSection().add(this);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Section Number: %d%n", getSectionNum()));
		sb.append(String.format("%-5s %-10s%n", "id", "Name"));
		
		for (Student st : students) {
			sb.append(String.format("%-5d %-10s%n", st.getId(), st.getName()));
		}
		
		return sb.toString();
	}
}
