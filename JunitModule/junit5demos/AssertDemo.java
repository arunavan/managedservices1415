package com.capgemini.junit5demos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo{
    @Test 
          public void simpleAdd() { 
	   int result = 1; 
	   int expected = 1; 
	   assertEquals(result, expected); 
  } } 
