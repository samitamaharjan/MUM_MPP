package standard_exam.prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalBalance = 0;
		
		for (Employee emp : list) {
			totalBalance += emp.computeUpdatedBalanceSum();
		}
		return totalBalance;
	}
}
