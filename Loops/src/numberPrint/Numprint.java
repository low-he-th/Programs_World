package numberPrint;
/*Problem 10 (Updated):
Write a Java program that uses nested loops to print a pattern of numbers in the following format:

Copy code
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5*/
import java.util.Scanner;

public class Numprint {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
System.out.println(" enter the number ");
	int n=scan.nextInt();
	for (int i=1;i<=n;i++) 
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
	scan.close();
}
}
