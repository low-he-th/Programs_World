package evenOrOdd;
/*Problem 6:
Write a Java program that takes an integer as input from the user and
 checks whether it is even or odd using conditional statements.
  Display an appropriate message based on the result.*/


import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num =scan.nextInt();
	if (num%2==0)
	{
		System.out.println("it is even number ");
	}else
	System.out.println("it is odd number");
	scan.close();
}
}
