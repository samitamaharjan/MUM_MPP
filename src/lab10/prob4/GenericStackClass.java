package lab10.prob4;

public class GenericStackClass {
	private Object arr[];
	private int top;
	
	public GenericStackClass(int n) {
		arr = new Object[n];
		top = -1;
	}
	
	public void push(Object item) {
		if (top == arr.length - 1) {
			System.out.println("Stack is full");
		}
	}
}
