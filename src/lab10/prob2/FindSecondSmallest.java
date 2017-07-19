package lab10.prob2;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallest {
	public static <T extends Comparable<? super T>> T secondMax(List<T> list) {
		T max1 = list.get(0);
		T max2 = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max1) > 0) {
				max2 = max1;
				max1 = i;
			} else if (i.compareTo(max2) > 0 && max2 != max1) {
				max2 = i;
			}
		}
		return max2;
	}
	
	public static <T extends Comparable<T>> T secondSmallest2(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 26, 4, 8, 62, 30, 100);
		System.out.println(secondMax(list1));
		
		List<Double> list2 = Arrays.asList(5.0, 26.0, 4.0, 8.0, 62.0, 30.0, 100.0);
		System.out.println(secondSmallest2(list2));
		
		List<String> list3 = Arrays.asList("A", "R", "C", "S", "A");
		System.out.println(secondMax(list3));
	}
}
