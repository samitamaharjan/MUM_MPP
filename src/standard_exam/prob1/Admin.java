package standard_exam.prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		return list.stream()
				.filter(student -> student.getGpa() > 3.0)
				.filter(student -> student.getMajor().equalsIgnoreCase("Computer Science"))
				.collect(Collectors.toList());
	}
}
