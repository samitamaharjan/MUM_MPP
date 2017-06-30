package lab4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hourly empHourly = new Hourly(9001, 20, 40);
		Salaried empSalaried = new Salaried(9005, 3500);
		
		Commissioned empCommission = new Commissioned(9006, 25, 500);
		empCommission.addOrder(new Order(122, LocalDate.of(2017, 05, 10), 6000));
		empCommission.addOrder(new Order(123, LocalDate.of(2017, 05, 15), 8000));
		empCommission.addOrder(new Order(124, LocalDate.of(2017, 05, 16), 2500));
		empCommission.addOrder(new Order(125, LocalDate.of(2017, 05, 18), 6000));
			
		List<Employee> list = new ArrayList<>();
		list.add(empHourly);
		list.add(empSalaried);
		list.add(empCommission);
		
		for(Employee emp : list) {
			emp.print(06, 2017);
		}
	}

}
