package lambda_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class City {
	private String cname;
	private long population;
	
	public City(String cname, long population) {
		this.cname = cname;
		this.population = population;
	}
	
	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [cname=" + cname + ", population=" + population + "]";
	}
	
	public static Comparator<City> sortedByName = new Comparator<City>() {

		@Override
		public int compare(City o1, City o2) {
			return o1.cname.compareTo(o2.cname);
		}
	};

	public static void main(String[] args) {
		List<City> list = new ArrayList<>();
		list.add(new City("LA", 20000));
		list.add(new City("IA", 10000));
		list.add(new City("NC", 35000));
		list.add(new City("NY", 45000));
		Collections.sort(list, City.sortedByName);
		System.out.println(list);
		
		// Using Lambdas
		System.out.println("====== Using Lambdas ============");
		Comparator<City> sortUsingLambda = (o1, o2)->o1.getCname().compareTo(o2.getCname());
		Collections.sort(list, sortUsingLambda);
		System.out.println(list);
		
		// to print city name only
		list.forEach((a) -> System.out.println(a.getCname()));
	}

}
