package methods;
/*Problem 1:
Write a Java method that takes two integers as parameters and returns their sum. Use this method to 
calculate and display the sum of two numbers provided by the user.*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("sum of two numbers is "+sum(num1,num2));
		scan.close();
	}
	public static int sum(int num1,int num2)
	{
		return num1+num2;
	}
}
