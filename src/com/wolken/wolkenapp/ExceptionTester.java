package com.wolken.wolkenapp;

public class ExceptionTester {
	public static void main(String[] args) {

		int a = 45;
		int b = 0;
		System.out.println("main started");
		/*
		 * try { System.out.println(a / b); } catch (ArithmeticException e) {
		 * System.out.println("divide by zero to be handled"); }
		 */

		/*
		 * String ranji = null; try { System.out.println(ranji.charAt(0)); } catch
		 * (NullPointerException e) { System.out.println("null pointer errors"); }
		 */

		/*
		 * int a[] = { 1, 3, 5, 8 }; try { System.out.println(a[8]); } catch
		 * (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("array out of bound"); }
		 */

		System.out.println("main started");
		try {
			loadExceptions();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main ended");
	}

	public static void loadExceptions() throws ClassNotFoundException {
		System.out.println("expection entered");
		Class.forName("com.wolken.wolkenapp.Expection Tester");
	}

}
