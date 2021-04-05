package com.wolken.wolkenapp;

import java.util.Scanner;

public class ExecptionUtil {
	public static void main(String[] args) {
		System.out.println("enter integers a and b");
		Scanner scanner =new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("divide by zero to be handled");
		}
		String ranji = "askhfg";
		int c[] = { 1, 3, 5, 8 };
		try {
			System.out.println(ranji.charAt(0));
			System.out.println(c[8]);
		} catch (NullPointerException |ArrayIndexOutOfBoundsException e) {
			System.out.println("null pointer errors or array out of bound ");
		}
		
	}

}
