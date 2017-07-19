package MeiLiExam.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

	static int[][] computeProduct(int[] first, int[] second){
		int size = first.length * second.length;
		int[][] pairs = new int[size][];
		int count=0;
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				pairs[count++] = new int[]{first[i], second[j]};
			}
		}
		return pairs;
	}
	
	static <K, V> List<NewPair<K, V>> computeProduct1(List<K> list1, List<V> list2) {
		List<NewPair<K, V>> productList = new ArrayList<>();
		for (K k : list1) {
			for (V v : list2) {
				 // productList.add(new NewPair(k, v)); //OR
				NewPair<K, V> pair = new NewPair<K, V>(k, v);
				productList.add(pair);
				
			}
	 	}
		return productList;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,6};
		int[] arr2 = {1,5};
		int[][] product = computeProduct(arr1, arr2);
		for (int i = 0; i < product.length; i++) {
			System.out.println(Arrays.toString(product[i]));
		}
		
		List<Integer> listofInt = Arrays.asList(1, 2, 5, 8, 15);
		List<String> listofString = Arrays.asList("A", "B", "C", "D");
		List<NewPair<Integer, String>> result = computeProduct1(listofInt, listofString);
		System.out.println(result);
	}
}
