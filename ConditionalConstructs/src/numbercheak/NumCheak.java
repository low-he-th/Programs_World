package numbercheak;

/*Problem 1:Problem 1:
Write a Java program that takes an integer as input from the user and 
checks whether it is positive, negative, or zero using conditional statements.
 Display an appropriate message based on the result.*/
import java.util.Scanner;

public class NumCheak {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
			System.out.println("enter the number");;
	int num=scan.nextInt();
	{
	if(num<0) {
	System.out.println("number is negative");
	}
	else if (num>0) {
		System.out.println("number is positive");
	}
	else 
	{
		System.out.println("number is zero");
	}
	scan.close();
	}
	
}
}
