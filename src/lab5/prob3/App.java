package lab5.prob3;

public class App {

	public static void main(String[] args) {
		VehicleFactory.getVehicle("bus").startEngine();
		VehicleFactory.getVehicle("truck").startEngine();
		VehicleFactory.getVehicle("car").startEngine();
	}

}
