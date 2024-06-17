package com.stg;

public class LuxuryTransportFactory implements TransportFactory {

	@Override
	public Car createCar() {
		return new LuxuryCar();
	}

	@Override
	public Bus createBus() {
		 return new LuxuryBus();
	}

}
