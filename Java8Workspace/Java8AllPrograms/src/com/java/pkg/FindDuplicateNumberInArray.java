package com.java.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 2, 12, 34, 2, 11,5,12 };
		List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.groupingBy(i -> i))
        .entrySet()
        .stream()
        .filter(e -> e.getValue().size() > 1)
        .map(e -> e.getKey())
        .collect(Collectors.toList());
		System.out.println(collect);

	}

}