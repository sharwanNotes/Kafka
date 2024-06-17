package com.stg;

public class TestSingleton {

	public static void main(String[] args) {
		LazyInitializedSingleton instance01 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance02 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance03 = LazyInitializedSingleton.getInstance();
		System.out.println(instance01);
		System.out.println(instance02);
		System.out.println(instance03);
	}

}
