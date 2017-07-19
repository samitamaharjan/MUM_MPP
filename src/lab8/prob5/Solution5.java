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
		fruits.forEach(s -> System.out.println(s));
		
		// b. Print the given list using method reference
		System.out.println("Using method reference:");
		fruits.forEach(System.out :: println);
		
		// Problem2:
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		// a. Use Arrays.sort()to sort the names by ignore case using Method reference. 
		
		//Arrays.sort(names, String::compareToIgnoreCase);
		Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2) );
		//System.out.println(Arrays.toString(names));	
		Function<String[], String> arr = Arrays::toString;
		// Function<String[], String> arr1 = a -> Arrays.toString(a);
		System.out.println(arr.apply(names));
	}
}
