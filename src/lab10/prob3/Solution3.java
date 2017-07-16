package lab10.prob3;

import java.util.Arrays;
import java.util.List;

public class Solution3 {
	public static <T extends Number> double sumOfList(List<T> list) {
		double sum = 0.0;
		for (T num : list) {
			sum = sum + num.doubleValue();
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		List<Double> list1 = Arrays.asList(5.0, 6.0, 10.0);
		System.out.println(sumOfList(list1));
		
		List<Float> list2 = Arrays.asList(5.0f, 6.0f, 10.0f);
		System.out.println(sumOfList(list2));
		
		List<Integer> list3 = Arrays.asList(5, 6, 10);
		System.out.println(sumOfList(list3));
		
		List<Long> list4 = Arrays.asList(100L, 200L, 300L);
		System.out.println(sumOfList(list4));
	}
}
