package multable;

import java.util.Scanner;

/*Problem 9:
Write a Java method that takes an integer as a parameter and prints the multiplication table for that number up to 10. Use this method to print the multiplication table for a number provided by the user.*/
public class Multable {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the num");
	int num=scan.nextInt();
	Table(num);
	scan.close();
}
public static void Table(int num) {
	for(int i=1;i<=10;i++)
	{
		int res=num*i;
		System.out.println(num+" X "+i+" = "+res);
	}
	
}
}
