package productElement;

import java.util.Scanner;

public class ProductElement {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array length");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
			arr[i]=scan.nextInt();
	}
	int res[]=product(arr);
for(int a:res)
{
	System.out.println(a+" ");
}
}
public static int[] product(int arr[])
{
	int product=1;
	int count=0;
	for(int x:arr)
	{
		product*=x;
		count++;
	}
	int arr1[]=new int[2];
	arr1[0]=count;
	arr1[1]=product;
	return arr1;
	
}
}
