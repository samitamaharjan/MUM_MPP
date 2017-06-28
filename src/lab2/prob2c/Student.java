package lab2.prob2c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int id;
	private List<Section> section;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		section = new ArrayList<Section>();
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public List<Section> getSection() {
		return section;
	}

	public void addSection(Section sec) {
		section.add(sec);
		sec.getStudents().add(this);
	}
}
