package dowhileloop;
/*Problem 3:
Write a Java program that uses a do-while loop to repeatedly ask the user for a number until they enter -1. Calculate and 
display the sum of all the numbers entered (excluding -1).*/
import java.util.Scanner;

public class SumNum {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int sum=0;
	do
	{
		System.out.println("enter the number");
		int n=scan.nextInt();
		if (n!=-1) 
		{
		sum+=n;
		}
		else
		break;
	}while(true);
	System.out.println("sum of numbers are "+sum);
	scan.close();
	}
}
