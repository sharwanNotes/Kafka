package com.stg;

public class RegularTransportFactory implements TransportFactory{

	@Override
	public Car createCar() {
		 return new RegularCar();
	}

	@Override
	public Bus createBus() {
		 return new RegularBus();
	}

}
