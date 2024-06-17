package com.stg;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();

		// Create a Car object using the factory
		Vehicle vehicle1 = vehicleFactory.createVehicle("CAR");
		vehicle1.drive();

		// Create a Bike object using the factory
		Vehicle vehicle2 = vehicleFactory.createVehicle("BIKE");
		vehicle2.drive();

		// Create a Truck object using the factory
		Vehicle vehicle3 = vehicleFactory.createVehicle("TRUCK");
		vehicle3.drive();
	}
}
