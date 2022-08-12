package com.capgemini.junit5demos;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTest {

	@RepeatedTest(10)
	void test() {
		System.out.println("First Test Case .....");
	}

}
