package smalestElement;

import java.util.Scanner;

public class SmallestElement {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the array lenght");
	int arr[]=new int[scanner.nextInt()];
	System.out.println("enter th eelemnets");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scanner.nextInt();
		
	}
	System.out.println("smallest element is "+smallestelement(arr));
}
public static int smallestelement(int arr[])
{
	int smallest=arr[0];
	for(int x:arr)
	{
		if(x<smallest)
		{
			smallest=x;
		}
	}
	return smallest;
}
}
