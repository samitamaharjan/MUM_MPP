package lab10.prob1;

import java.util.Arrays;
import java.util.List;

public class Capture {
	public static void reverse(List<?> list) {
		reverseHelper(list);
	}
	
	private static <T> void reverseHelper(List<T> list) {
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("Java", "MPP", "SE", "Data");
		 reverse(list);
		 
		 List<Integer> list1 = Arrays.asList(1, 2, 3);
		 reverse(list1);
	}
}
