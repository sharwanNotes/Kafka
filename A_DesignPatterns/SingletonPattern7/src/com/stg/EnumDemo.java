package com.stg;

public class EnumDemo {

	public static void main(String[] args) {
		SingletonEnum instance01 = SingletonEnum.INSTANCE;
		SingletonEnum instance02 = SingletonEnum.INSTANCE;
		System.out.println(instance01);
		System.out.println(instance02);

	}

}
