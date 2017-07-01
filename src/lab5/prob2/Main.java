package lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Figure> list = new ArrayList<>();
		
		list.add(new Triangle(5.0, 5.0));
		list.add(new Rectangle(5.0, 6.0));
		list.add(new Circle(5.0));
		
		double totalArea = 0;
		for (Figure figure : list) {
			totalArea += figure.computeArea();
		}
		
		System.out.printf("Sum of Areas = %.2f", totalArea);
	}

}
