package lab10;

import java.util.Arrays;
import java.util.List;

public class Solution3 {
	public static <T> double sumOfList(List<T> list) {
		T sum;
		for (T num : list) {
			sum += num;
		}
		return (double) sum;	
	}
	
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(5.0, 6.0, 10.0);
		System.out.println(sumOfList(list));
		
		List<Integer> list1 = Arrays.asList(5, 6, 10);
		System.out.println(sumOfList(list1));
	}
}
