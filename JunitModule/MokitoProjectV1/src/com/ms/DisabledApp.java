package com.ms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//@Disabled("Disable until issue #112 got fixed")
public class DisabledApp {
@Test
public void test_Add() {
	MathUtil m=new MathUtil();
Assert.assertEquals(5, m.add(3, 2));
}
@Test (expected=Exception.class)
@RepeatedTest(5)
@DisplayName("My Multipley testcase-001")
public void test_Multiply() throws Exception{
	Assert.assertEquals(15, MathUtil.multiple(3, 5));
}
@Test
@Disabled("Disable until issue #112 got fixed")
public void test_Devide() {
	Assert.assertEquals(5, MathUtil.devide(25, 5));
}

@Test
public void testIs_Prime() {
	Assertions.assertTrue(MathUtil.isPrime(13));
}
}
