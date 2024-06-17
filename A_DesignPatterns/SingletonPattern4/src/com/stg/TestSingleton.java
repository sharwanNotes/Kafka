package com.stg;

public class TestSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton instance01 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance02 = ThreadSafeSingleton.getInstance();
		System.out.println(instance01);
		System.out.println(instance02);

	}

}
