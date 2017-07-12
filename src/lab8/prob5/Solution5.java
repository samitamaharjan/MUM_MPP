package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Solution5 {
	
	public static void main(String[] args) {
		// Problem1:
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		// a. Print the given list using forEach with Lambdas
		System.out.println("Using Lambdas:");
		fruits.forEach((s) -> System.out.println(s));
		
		// b. Print the given list using method reference
		System.out.println("Using method reference:");
		fruits.forEach(System.out :: println);
		
		// Problem2:
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		// a. Use Arrays.sort()to sort the names by ignore case using Method reference. 
		
		// Arrays.sort(names);
		Function<String[], String[]> f = new Function<String[], String[]>() {

			@Override
			public String[] apply(String[] t) {
				Arrays.sort(names);
				return names;
			}
		};
		System.out.println(Arrays.toString(names));
	}
}
