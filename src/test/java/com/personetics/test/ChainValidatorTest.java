package com.personetics.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ChainValidatorTest {

	@Test
	public void chainValidatorWithLetters() {

		assertTrue(new ChainValidator().validate(List.of(new Node("p"), new Node("aba"), new Node("a"), new Node("b"),
				new Node("perso"), new Node("o"), new Node("r"), new Node("e"), new Node("s"))));

		assertFalse(new ChainValidator().validate(List.of(new Node("p"), new Node("abat"), new Node("a"), new Node("b"),
				new Node("perso"), new Node("o"), new Node("r"), new Node("e"), new Node("s"))));

		assertFalse(new ChainValidator().validate(List.of(new Node("p"), new Node("aba"), new Node("a"), new Node("b"),
				new Node("perso"), new Node("ol"), new Node("r"), new Node("e"), new Node("s"))));

		assertTrue(new ChainValidator()
				.validate(List.of(new Node("p"), new Node("aba"), new Node("a"), new Node("b"), new Node("perso"),
						new Node("od"), new Node("r"), new Node("e"), new Node("s"), new Node("d"), new Node("o"))));

	}

	@Test
	public void chainValidatorWithNumbers() {

		assertTrue(new ChainValidator().validate(List.of(new Node(27), new Node(3), new Node(2), new Node(7),
				new Node(47), new Node(4), new Node(24), new Node(6), new Node(36))));

		assertFalse(new ChainValidator()
				.validate(List.of(new Node(4), new Node(24), new Node(6), new Node(65), new Node(5), new Node(35))));

		assertTrue(new ChainValidator().validate(List.of(new Node(2), new Node(24), new Node(4))));

		assertTrue(new ChainValidator().validate(List.of(new Node(2), new Node(4), new Node(24))));

		assertTrue(new ChainValidator().validate(List.of(new Node(24), new Node(4), new Node(2))));

		assertTrue(new ChainValidator().validate(List.of(new Node(24), new Node(2), new Node(4))));

		assertTrue(new ChainValidator()
				.validate(List.of(new Node(24), new Node(25), new Node(45), new Node(2), new Node(5), new Node(4))));

	}

}
