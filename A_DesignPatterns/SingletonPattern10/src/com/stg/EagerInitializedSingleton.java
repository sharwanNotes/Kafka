package com.stg;

public class EagerInitializedSingleton implements Cloneable {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
