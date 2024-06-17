package com.stg;

public class TransportationApplication {
	private Car car;
	private Bus bus;

	public TransportationApplication(TransportFactory factory) {
		car = factory.createCar();
		bus = factory.createBus();
	}

	public void startJourney() {
		car.drive();
		bus.drive();
	}

	public static void main(String[] args) {
		TransportFactory factory;

		String transportType = "luxury"; // Change this to "regular" for regular transport

		if ("regular".equalsIgnoreCase(transportType)) {
			factory = new RegularTransportFactory();
		} else {
			factory = new LuxuryTransportFactory();
		}

		TransportationApplication app = new TransportationApplication(factory);
		app.startJourney();
	}
}
