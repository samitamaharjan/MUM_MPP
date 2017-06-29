package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String buildingName;
	private double maintenanceCost;
	private List<Apartment> apartments;
	
	public Building (String buildingName, double maintenanceCost, Apartment apt) {
		this.buildingName = buildingName;
		this.maintenanceCost = maintenanceCost;
		apartments = new ArrayList<>();
		addApartment(apt);
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}
	
	public void addApartment(Apartment apt) {
		apartments.add(apt);
	}
	
	public double getBuildingProfit() {
		double totalProfit = 0;
		for(Apartment apt : apartments) {
			totalProfit += apt.getRent();
		}
		return totalProfit - getMaintenanceCost();
	}
}
