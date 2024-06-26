package com.stg.coding.character;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String inputString = "SHarwan Kumar From Bhagalpur".replaceAll("/s", "").toLowerCase();
		LinkedHashMap<String, Long> charCount = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String firstNonRepeatedChar = charCount.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).findFirst().get();
		System.out.println(firstNonRepeatedChar);
	}

}
