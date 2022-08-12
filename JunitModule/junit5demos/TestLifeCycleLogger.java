package com.capgemini.junit5demos;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

	@TestInstance(Lifecycle.PER_CLASS)
	interface TestLifecycleLogger {
	
	    
	
	    @BeforeAll
	    default void beforeAllTests() {
	        System.out.println("Before all tests");
	    }
	
	    @AfterAll
	    default void afterAllTests() {
	        System.out.println("After all tests");
	    }
	    @BeforeEach
	    default public void start123() {
	    	System.out.println("strated...");
	    }
	    @AfterEach
	    default public void end123() {
	    	System.out.println("end  of test case");
	    }
	    @Test
	    default void testMethod() {
	    	System.out.println("this is test method...");
	    }
	
	}