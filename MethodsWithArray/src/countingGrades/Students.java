package countingGrades;

import java.util.Scanner;

public class Students {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of students");
	int arr[]=new  int[scan.nextInt()];
	System.out.println("enter the students grades");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	int count=0;
	for(int x:arr)
	{
		if(x>=75)
		{
			count++;
		}
	}
	System.out.println("number of students scored above 75 are: " +count);
}
}
