package standard_exam_sample.problem2;

import java.time.LocalDate;
import java.util.List;

public class Programmer extends Employee{

	private List<Certificate> list;
	public Programmer(String n, double s, LocalDate hireDate, List<Certificate> l) {
		super(n, s, hireDate);
		this.list = l;
	}

}
