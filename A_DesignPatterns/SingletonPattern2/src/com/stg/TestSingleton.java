package com.stg;

public class TestSingleton {
	public static void main(String[] args) {
		   StaticBlockSingleton instance01 = StaticBlockSingleton.getInstance();
		   StaticBlockSingleton instance02 = StaticBlockSingleton.getInstance();
		   StaticBlockSingleton instance03 = StaticBlockSingleton.getInstance();
		   System.out.println(instance01);
		   System.out.println(instance02);
		   System.out.println(instance03);
		}

}
