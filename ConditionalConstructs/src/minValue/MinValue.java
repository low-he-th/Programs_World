package minValue;
/*Problem 3:
Write a Java program that takes three integers as input from the user and 
determines the minimum of the three using conditional statements.
 Display the minimum value.*/
import java.util.Scanner;

public class MinValue {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int num3=scan.nextInt();
	if (num1<=num2&&num1<=num3)
	{
		System.out.println("num1 is minimum valve");
	}
	else if(num2<=num1&&num2<=num3){
		System.out.println("num2 is the minimum value");
	}
	else
		System.out.println("num3 is minimum value");
	scan.close();
}
}
