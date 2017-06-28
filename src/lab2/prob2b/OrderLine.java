package lab2.prob2b;

public class OrderLine {
	private int lineNo;
	private double price;
	private int quantity;
	private Order order;
	
	OrderLine(int lineNo, double price, int quantity, Order order) {
		this.lineNo = lineNo;
		this.price = price;
		this.quantity = quantity; 
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public int getLineNo() {
		return lineNo;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
