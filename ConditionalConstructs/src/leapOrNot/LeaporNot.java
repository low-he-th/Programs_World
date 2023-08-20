package leapOrNot;
/*Problem 5:
Write a Java program that takes a year as input from the user and
 checks whether it is a leap year or not using conditional statements.
 Display an appropriate message based on the result.*/
import java.util.Scanner;

public class LeaporNot {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the year ");
	int year =scan.nextInt();
	if(year%4==0&&(year%100==0||year%400==0))
			{
		System.out.println("it is  leap year ");
			}else
				System.out.println("it is not leap year ");
			scan.close();
}
}
