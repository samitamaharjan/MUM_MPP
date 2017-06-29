package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

class Landlord {
	private String nameOfLandlord;
	private List<Building> buildings;
	
	public Landlord(String name, Building bldg) {
		nameOfLandlord = name;
		buildings = new ArrayList<>();
		addBuilding(bldg);
	}

	public String getNameOfLandlord() {
		return nameOfLandlord;
	}

	public List<Building> getBuildings() {
		return buildings;
	}
	
	public void addBuilding(Building bld) {
		buildings.add(bld);
	}
	
	public double getTotalProfit() {
		double totalProfit = 0;
		for(Building bldg : buildings) {
			totalProfit += bldg.getBuildingProfit();
		}
		return totalProfit;
	}
	
	public static void main(String[] args) {
		Building b1 = new Building("Mc Laughing", 900, new Apartment(500));
		b1.addApartment(new Apartment(800));
		b1.addApartment(new Apartment(980));
		
		Building b2 = new Building("Argiro", 800, new Apartment(1000));
		b2.addApartment(new Apartment(1500));
		b2.addApartment(new Apartment(2500));
		
		Landlord samita = new Landlord("Samita", b1);
		samita.addBuilding(b2);
		System.out.println(samita.getTotalProfit());
	}
}
