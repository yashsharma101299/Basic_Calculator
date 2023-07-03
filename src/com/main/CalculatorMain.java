package com.main;

import java.util.Scanner;

public class CalculatorMain {
	public int a, b;

	public static int addition(int c, int d) {
		return c + d;
	}

	public static int Subtraction(int c, int d) {
		return c - d;
	}

	public static int division(int c, int d) {
		return c / d;
	}

	public static int multiplivation(int c, int d) {
		return c * d;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to calculator application:");
		while(true) {
		System.out.println("Please enter your choise");
		System.out.println(
				"press 1 for  addition\n press 2 for subtraction\n press 3 for multiplication\n press 4 for division\n press 5 for EXIT\n");

		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch (choice) {
		case "1": {
			System.out.println("Enter First Number:");
			int a = sc.nextInt();
			System.out.println("Enter Second Number:");
			int b = sc.nextInt();
			int addition = CalculatorMain.addition(a, b);
			System.out.println("The Additioin of " + a + " and " + b + " is:" + addition);
			System.out.println();
		}
			break;
		case "2": {
			System.out.println("Enter First Number:");
			int a = sc.nextInt();
			System.out.println("Enter Second Number:");
			int b = sc.nextInt();
			int addition = CalculatorMain.Subtraction(a, b);
			System.out.println("The Subtraction of " + a + " and " + b + " is:" + addition);
			System.out.println();
		}
			break;
		case "3": {
			System.out.println("Enter First Number:");
			int a = sc.nextInt();
			System.out.println("Enter Second Number:");
			int b = sc.nextInt();
			int addition = CalculatorMain.multiplivation(a, b);
			System.out.println("The Multiplication of " + a + " and " + b + " is:" + addition);
			System.out.println();
		}
			break;
		case "4": {
			System.out.println("Enter First Number:");
			int a = sc.nextInt();
			System.out.println("Enter Second Number:");
			int b = sc.nextInt();
			int addition = CalculatorMain.division(a, b);
			System.out.println("The Division of " + a + " and " + b + " is:" + addition);
			System.out.println();
		}
			break;
		case "5": {
			System.out.println("Thanks for using the calculator....");
			System.exit(0);}
		default:
			System.out.println("Enter Valid Inputs");
			break;
		}
		sc.close();

	}
	}

}
