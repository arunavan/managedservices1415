package com.ms;

public class MathUtil { //70%

	public static Object multiple(int i, int j) throws Exception {
		if(i<10)
			throw new Exception("Invalid range");
		return i*j;
	}

	public static Object add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static Object devide(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	public static Boolean  isPrime(int i) {
		// TODO Auto-generated method stub
		return true;
	}

}
