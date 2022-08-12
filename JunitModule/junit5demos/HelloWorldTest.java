package com.capgemini.junit5demos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class HelloWorldTest implements TestLifecycleLogger{

	@Test
	void test() {
		//System.out.println("First Test Case");
		assertNull("java");
	}

	

}
