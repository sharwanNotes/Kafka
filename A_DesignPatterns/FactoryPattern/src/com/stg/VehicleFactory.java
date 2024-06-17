package com.stg;

public class VehicleFactory {
	// Factory method to create objects based on the input vehicleType
	public Vehicle createVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		}
		if (vehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if (vehicleType.equalsIgnoreCase("BIKE")) {
			return new Bike();
		} else if (vehicleType.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		}
		return null;
	}
}
