package lab2.prob2b;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(101, LocalDate.now(), 5, 1500.55, 2);
		order.addOrderLine(4, 2000.50, 5);
		order.addOrderLine(6, 1850.95, 3);
		System.out.println(order);
	}
}
