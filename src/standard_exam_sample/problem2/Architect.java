package standard_exam_sample.problem2;

import java.time.LocalDate;
import java.util.List;

public class Architect extends Employee {
	List<SeminarsConducted> seminars;
	public Architect(String name, double salary, LocalDate hireDate, List<SeminarsConducted> reasons) {
		super(name, salary, hireDate);
		this.seminars = reasons;	
	}
	
	@Override
	public double getSalary() {
		return getSalary() + computeBonus();
	}
	
	double computeBonus() {
		int hireYear = getHireDate().getYear();
		int thisYear = LocalDate.now().getYear();
		return 400 * (thisYear - hireYear);
	}
	
}

