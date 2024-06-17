package com.stg.coding.character;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacter {

	public static void main(String[] args) {
	String inputString = "Sharwan Kumar From Bhagalpur".replaceAll("/s", "").toLowerCase();
	LinkedHashMap<String,Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	System.out.println(collect);

	}

}
