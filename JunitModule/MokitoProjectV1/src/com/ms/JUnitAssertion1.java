package com.ms;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class JUnitAssertion1 { 
	@Timeout(10)  
    @Test
    public void groupedAssertionTest () { 
                      float a=(float) 1.2;
           float b=(float) 1.2;
           float delta=(float) 1.0;
 Iterable<String> expectedList = new ArrayList<>(Arrays.asList("First", "Two","Third"));
 Iterable<String> actualList = new ArrayList<> (Arrays.asList("First", "Two","Third"));
           Assertions.assertAll (
           "GroupedAssertionHeading",
           () -> Assertions.assertEquals (a, b),
           () -> Assertions.assertIterableEquals (expectedList, actualList)
    );

    }
}
