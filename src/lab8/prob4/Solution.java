package lab8.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Solution {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Camera", 600.75, 111));
		productList.add(new Product("Camera", 505.0, 99));
		productList.add(new Product("Camera Bag", 150.0, 222));
		productList.add(new Product("Lens", 90.0, 333));
		productList.add(new Product("Tripod", 200.75, 444));
		
		Comparator<Product> sortByPrice = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return (int) (o1.getPrice() - o2.getPrice());
			}			
		};
		
		// a. Sorted by price attribute and printed product list
		Collections.sort(productList, sortByPrice);
		System.out.println("Sorted By Price:");
		System.out.println(productList);
		
		Comparator<Product> sortByTitle = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}			
		};
		
		// b. Sorted by title attribute and printed product list
		Collections.sort(productList, sortByTitle);
		System.out.println("Sorted By Title:");
		System.out.println(productList);
		
		// c. Sort by decreasing order of price using lambdas
		Comparator<Product> sortPriceDesc = (o1, o2) -> (int) (o2.getPrice() - o1.getPrice());
		Collections.sort(productList, sortPriceDesc);
		System.out.println("Sorted By Price in descending order:");
		System.out.println(productList);
		
		// d. Sort by decreasing order of title using lambdas
		productList.sort((o1, o2) -> o2.getTitle().compareTo(o1.getTitle()));
		System.out.println("Sorted By Title in descending order:");
		System.out.println(productList);
		
		// e. If the title is same use model as another attribute to sort
		Function<Product, Integer> byModel = model -> model.getModel();
		Function<Product, String> byTitle = title -> title.getTitle();
		Collections.sort(productList, Comparator.comparing(byTitle).thenComparing(byModel));
		
		System.out.println("Sorted By Title first then model");
		System.out.println(productList);
		
	}
}
