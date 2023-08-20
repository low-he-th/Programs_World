package problem4;

import java.util.Scanner;

/*Write a Java program to check whether a given year is a leap year or not. 
 A leap year is divisible by 4, but not by 100, unless it is divisible by 400.
  Use the appropriate operators to perform the checks and display the result.*/
public class Problem4 {
public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.err.println("enter the year");
	int year =scan.nextInt();
	if (year%4==0&&(year%400==0||year%100==0))
	{
		System.out.println("the given year is leap year ");
	}else {
		System.out.println("the given year is not leap year");
	}
	scan.close();
}
}
