package com.stg;

public class TestSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton instance01 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton instance02 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(instance01);
		System.out.println(instance02);

	}

}
