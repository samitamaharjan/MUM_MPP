package lab2.prob2b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate dateOfOrder;
	List<OrderLine> orderLine;
	
	public Order(int orderNum, LocalDate dateOfOrder, int lineNo, double price, int quantity) {
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
		orderLine = new ArrayList<OrderLine>();
		addOrderLine(lineNo, price, quantity);
	}

	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	
	public void addOrderLine(int lineNo, double price, int quantity) {
		orderLine.add(new OrderLine(lineNo, price, quantity, this));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Order Number: %d%n", orderNum));
		sb.append(String.format("%-10s %-10s %-10s %n", "LineNo", "Price", "Quantity"));
		
		for(OrderLine line : orderLine) {
			sb.append(String.format("%-10d %-10.2f %-10d %n", line.getLineNo(), line.getPrice(), line.getQuantity()));
		}
		return sb.toString();
	}
}	
