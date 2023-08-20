package SumOfnum;
/* Problem 2:
Write a Java program that uses a while loop to calculate the sum of all numbers from 1 to 100.
 Display the sum.*/
import java.util.Scanner;

public class SumofNum {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number to be summed  ");
	int n=scan.nextInt();
	 int sum=0;
	 int i=1;
	while(i<=n)
	{
		
		sum+=i;
		i++;
	}
	scan.close();
	System.out.println(sum);
}
}
