package lab10.prob2;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallest {
	public static <T extends Comparable<T>> T secondMax(List<T> list) {
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
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 26, 4, 8, 62, 30, 100);
		System.out.println(secondMax(list));
	}
}
