package lab5.prob3;

public class VehicleFactory {
	private VehicleFactory() {
		
	}
	
	public static Vehicle getVehicle(String v) {
		if (v == null) return null;
		
		if (v.equalsIgnoreCase("Bus")) {
			return new Bus();
		} else if (v.equalsIgnoreCase("Truck")) {
			return new Truck();
		} else if (v.equalsIgnoreCase("Car")) {
			return new Car();
		} else if (v.equalsIgnoreCase("ElectricCar")) {
			return new ElectricCar();
		}
		return null;
	}
}
