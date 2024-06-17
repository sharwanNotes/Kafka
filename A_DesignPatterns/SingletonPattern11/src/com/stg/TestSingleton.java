package com.stg;

public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		EagerInitializedSingleton instance01 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance02 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance03 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance04 = (EagerInitializedSingleton) instance01.clone();
		System.out.println(instance01);
		System.out.println(instance02);
		System.out.println(instance03);
		System.out.println(instance04);

	}

}
