package com.personetics.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChainValidator {

	boolean validate(List<Node> nodes) {

		Set<String> multipleDigits = new HashSet<>();
		Set<String> singleDigits = new HashSet<>();

		for (Node node : nodes) {
			if (node.getDigits().length() > 1) {
				for (char string : node.getDigits().toCharArray()) {
					multipleDigits.add(Character.toString(string));
				}
			} else {
				singleDigits.add(node.getDigits());
			}
		}

		String[] arrayMultipleDigits = multipleDigits.stream()
				.map(String::valueOf)
				.toArray(String[]::new);

		String[] arraySingleDigits = singleDigits.stream()
				.map(String::valueOf)
				.toArray(String[]::new);

		Arrays.sort(arrayMultipleDigits);
		Arrays.sort(arraySingleDigits);

		return Arrays.equals(arrayMultipleDigits, arraySingleDigits);
	}

}
