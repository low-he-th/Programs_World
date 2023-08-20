package calculator;

import java.util.Scanner;
/*Problem 1:
Write a Java program that takes two integers as input from the user and
calculates their sum, difference, product, and quotient (integer division)
using the appropriate operators. 
Display the results.*/
public class Problem1 {
public static void main(String[] args) {
	try (Scanner scan = new Scanner (System.in)) {
		System.err.println("enter first number ");
		int a=scan.nextInt();
		System.err.println("enter the second number");
		int b=scan.nextInt();
		System.out.println("addtion "+(a+b));
		System.out.println("sub result "+(a-b));
		System.out.println("mul result "+(a*b));
		System.out.println("div result "+(a/b));
		System.out.println("quotient/remainder  "+(a%b));
	}
}
}
