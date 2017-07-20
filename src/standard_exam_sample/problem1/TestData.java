package standard_exam_sample.problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestData {


	public static List<Commissioned> getAllCommissionedEmployees() {

		return commissionedEmployees;

	}

	public static List<Order> getAllOrders() {

		List<Order> orders = new ArrayList<>();
		orders.addAll(orders1);
		orders.addAll(orders3);
		orders.addAll(orders4);
		return orders;

	}

	static List<Order> orders1 = new ArrayList<Order>() {
		{
			add(new Order("001", LocalDate.of(2015, 7, 19), 345));
			add(new Order("002", LocalDate.of(2016, 8, 19), 300));

		}
	};

	static List<Order> orders3 = new ArrayList<Order>() {
		{

			add(new Order("003", LocalDate.of(2015, 4, 19), 4345));
			add(new Order("004", LocalDate.of(2015, 6, 14), 1345));
			add(new Order("005", LocalDate.of(2015, 5, 10), 3145));
			add(new Order("006", LocalDate.of(2015, 7, 1), 3405));
		}
	};
	static List<Order> orders4 = new ArrayList<Order>() {
		{
			add(new Order("007", LocalDate.of(2015, 7, 19), 345));
			add(new Order("008", LocalDate.of(2016, 8, 19), 200));
			add(new Order("009", LocalDate.of(2015, 6, 19), 34));
			add(new Order("010", LocalDate.of(2015, 5, 19), 45));
			add(new Order("011", LocalDate.of(2015, 4, 19), 4345));
			add(new Order("012", LocalDate.of(2015, 7, 1), 3405));
		}
	};
	static List<Commissioned> commissionedEmployees = new ArrayList<Commissioned>() {
		{
			add(new Commissioned("001", 0.02, 2000, orders1));
			add(new Commissioned("201", 0.15, 1000, orders3));
			add(new Commissioned("102", 0.25, 500, orders4));
		}
	};
}
