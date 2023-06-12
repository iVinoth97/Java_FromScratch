package com.auto.javalearn;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String someString = "elephant";
		char someChar = 'e';
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		assertEquals(1, count);
	}

	private static void assertEquals(int i, int count) {
		// TODO Auto-generated method stub
		System.out.println("The Occurence is "  + count);
	}

}
