package lambda_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CityLambda {
	private String cname;
	private long population;
	
	public CityLambda(String cname, long population) {
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
	
	public static Comparator<CityLambda> sortedByName = new Comparator<CityLambda>() {

		@Override
		public int compare(CityLambda o1, CityLambda o2) {
			return o1.cname.compareTo(o2.cname);
		}
	};

	public static void main(String[] args) {
		List<CityLambda> list = new ArrayList<>();
		list.add(new CityLambda("LA", 20000));
		list.add(new CityLambda("IA", 10000));
		list.add(new CityLambda("NC", 35000));
		list.add(new CityLambda("NY", 45000));
		// Collections.sort(list, CityLambda.sortedByName);
		// Collections.sort(list, Comparator.comparing(CityLambda::getCname));
		list.sort(Comparator.comparing(CityLambda::getCname));
		System.out.println(list);
	}

}
