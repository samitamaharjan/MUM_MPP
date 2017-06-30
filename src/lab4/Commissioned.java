package lab4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
		
	public Commissioned(int empId, double commission, double baseSalary) {
		setEmpId(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList<>();
	}
	
	public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		LocalDate date = LocalDate.of(year, month, 20);
		date = date.minusMonths(1);
		double totalOrder = 0;
		for (Order order : orders) {
			if (order.getOrderDate().getMonth() == date.getMonth() &&
					order.getOrderDate().getYear() == date.getYear()) {
				
				totalOrder += order.getOrderAmount();
			}
		}
		return getBaseSalary() + (totalOrder * (getCommission() / 100));
	}
}
