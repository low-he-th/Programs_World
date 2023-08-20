package maxValue;
/*Problem 2:
Write a Java program that takes two integers as input from the user and
 determines the maximum of the two using conditional statements.
 Display the maximum value.*/
import java.util.Scanner;

public class MaxValue {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	if(num1>num2) {
		System.out.println("num1 is greater than num2");
	}
	else
		System.out.println("num2 is greater than num1");
	scan.close();
}
}
