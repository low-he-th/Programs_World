package pyramidAsterisks;

import java.util.Scanner;

public class Pyramid {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number of rows");
	int rows=scan.nextInt();
	for(int i=1;i<=rows;i++)
	{
		//print spaces
		for(int j=1;j<=rows-i;j++)
		{
		System.out.print(" ");
		}
		//print asterisks
		for(int k=1;k<=2*i-1;k++) 
		{
		System.out.print("*");
	    }
		//moves to next line 
		System.out.println();
	}
	scan.close();
}
}

