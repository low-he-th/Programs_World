package array;
/*roblem 7:
Write a Java method that takes an array of integers as a parameter and finds the maximum and minimum elements in the array. The method should return an array containing the maximum and minimum values. Use this method to
 find and display the maximum and minimum elements in an array provided by the user.*/
import java.util.Scanner;

public class FindMaxMin {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enetr the array lenght");
int arr[]=	new int[scan.nextInt()];
System.out.println("enter the array elements");
for (int i=0;i<arr.length;i++) {
	arr[i]=scan.nextInt();
	
}
int res[]=FindingMaxMin.logic(arr);
System.out.println("max is "+res[0]);
System.out.println("min value id "+res[1]);
}
}

