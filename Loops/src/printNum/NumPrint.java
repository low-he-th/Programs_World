package printNum;
/*Problem 1:
Write a Java program that uses a for loop
 to print the numbers from 1 to 10.*/
import java.util.Scanner;

public class NumPrint {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int n=scan.nextInt();
	for (int i=1;i<=n;i++)
	{
		System.out.println(i);
	}
	scan.close();
}
}
