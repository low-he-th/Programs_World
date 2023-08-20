package positiveElement;

import java.util.Scanner;

public class PositiveSum {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number of transactions");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the transactions");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("positive transaction sum is "+Positivesum(arr));
	}
	public static int Positivesum(int arr[])
	{
		int positivesum=0;
		for(int x:arr)
		{
			if(x>=0)
			{
				positivesum+=x;
			}
		}
		return positivesum;
	}
}
