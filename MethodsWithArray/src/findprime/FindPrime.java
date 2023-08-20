package findprime;

import java.util.Scanner;

public class FindPrime {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int x:arr)
	if(Cheakprime(x))
	{
		System.out.println(x);
	}
	
}
public static boolean  Cheakprime(int x)
{
	
	if(x<=1)
	{
		return false;
	}
	else {
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		
	}
	
	return true;
}
}
