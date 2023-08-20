package problem7;

import java.util.Scanner;

/*Problem 7:
Write a Java program that takes a decimal number as input from the user and
 rounds it to the nearest integer using the appropriate operators.Display the rounded value.*/
public class Problem7 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the num");
	float num=scan.nextFloat();
	int roundednumber =Math.round(num);
	System.out.println("the rounder number is "+roundednumber);
	scan.close();
}
}
