package lab10.prob4;

import java.util.Arrays;

public class GenericStackClass<T> {
	private T[] arr;
	private int top;
	
	public GenericStackClass(int n) {
		arr = (T[]) new Object[n];
		top = -1;
	}
	
	public void push(T item) {
		if (top == arr.length - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			arr[top] = item;
		}
	}
	
	public T pop() {
		if (isEmpty() == true) return null;
		T value = arr[top];
		arr[top] = null;
		top--;
		return value;
	}
	
	public T peek() {
		if (isEmpty() == true) return null;
		return arr[top];
	}
	
	public boolean isEmpty() {
		if (top == -1) return true;
		return false;
	}
	
	public int size() {
		return top + 1;
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
}
