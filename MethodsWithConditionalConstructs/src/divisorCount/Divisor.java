package divisorCount;

import java.util.Scanner;

public class Divisor {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number "); 
	int num=scan.nextInt();
	int res=DivisorCount(num);
	System.out.println("number of divisore are "+res);
}
public static int DivisorCount(int num)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.println(i);
			count++;
		}
	}
	return count;
}
}
