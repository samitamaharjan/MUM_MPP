package lab10.prob4;

public class Main {

	public static void main(String[] args) {
		GenericStackClass<Integer> stack = new GenericStackClass<>(5);
		stack.push(50);
		stack.push(60);
		stack.push(25);
		stack.push(85);
		stack.push(60);
		
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		System.out.println("IsEmpty " + stack.isEmpty());
		System.out.println("Size " + stack.size());
		stack.print();
		
		System.out.println("=================");
		
		GenericStackClass<String> stackStr = new GenericStackClass<>(6);
		stackStr.push("A");
		stackStr.push("B");
		stackStr.push("C");
		stackStr.push("D");
		stackStr.push("E");
		stackStr.push("F");
		
		System.out.println("Peek: " + stackStr.peek());
		System.out.println("Pop: " + stackStr.pop());
		System.out.println("Pop: " + stackStr.pop());
		System.out.println("IsEmpty " + stackStr.isEmpty());
		System.out.println("Size " + stackStr.size());
		stackStr.print();
		
	}

}
