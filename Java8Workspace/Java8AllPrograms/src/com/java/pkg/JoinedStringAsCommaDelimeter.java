package com.java.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinedStringAsCommaDelimeter {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
         
        System.out.println(joinedString);

	}

}
