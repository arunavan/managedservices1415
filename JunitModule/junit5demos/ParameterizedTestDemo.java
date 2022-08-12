package com.capgemini.junit5demos;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = { "abc","xyz","123" })
	//@Test
	void withValueSource(String word) {
		assertNotNull(word);
	}
}
