package com.revature;

public class TestAdditionUtil2 {

	public static void main(String[] args) {

		testValidNumber();
		testNegativeNumber();
		testAdditionWithZero();
		
	}

	private static void testValidNumber() {
		System.out.println("Testing Valid Numbers");
		AdditionUtil additionUtil = new AdditionUtil();
		int result = additionUtil.add(2, 3);
		System.out.println(result);
	}
	
	private static void testNegativeNumber() {
		System.out.println("Testing Negative Numbers");
		AdditionUtil additionUtil = new AdditionUtil();
		int result = additionUtil.add(-2, -3);
		System.out.println(result);
	}
	
	private static void testAdditionWithZero() {
		System.out.println("Testing Negative Numbers");
		AdditionUtil additionUtil = new AdditionUtil();
		int result = additionUtil.add(0, -3);
		System.out.println(result);
	}

}
