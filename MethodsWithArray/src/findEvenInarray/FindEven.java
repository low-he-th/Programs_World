package findEvenInarray;

import java.util.Scanner;

public class FindEven {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array lenght");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();	
		}
	System.out.println("number of even numbers are "+EvenOrNot(arr));

}
public static int EvenOrNot(int arr[])
{
	int count=0;
	for(int x:arr)
	{
		if(x%2==0){
			count++;
			
		}
	}
	return count++;
}
}
