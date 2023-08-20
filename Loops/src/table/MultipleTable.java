package table;
/*Problem 5:
Write a Java program that uses a while loop to print the multiplication table of a given number. 
The table should be printed up to 10 times.*/
import java.util.Scanner;

public class MultipleTable {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number of the table");
	int n=scan.nextInt();
	int i=0;
	while(i<=10)
	{
	     int res=n*i;
		System.out.println(n+" x "+i+" ="+res);
		i++;
	}

	scan.close();
}
}
