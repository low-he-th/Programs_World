package arraysum;
/*Problem 4:
Write a Java method that takes an array of integers as a parameter and
 returns the sum of all the elements in the array. Use this method to calculate and display the sum of elements in an array provided by the user.
*/

import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
	  Scanner scan =new Scanner(System.in);
	  System.out.println("enter the array length");
int arr[]	=  new int[scan.nextInt()];
System.out.println("enter the array elements ");
 for (int i=0;i<arr.length; i++ )
 {
	 arr[i]=scan.nextInt();
 }
System.out.println("sum of array elemnts are "+arraySum(arr));
}
  public static int  arraySum(int arr[]) {
	  int sum=0;
	 for(int x:arr) {
		 sum=sum+x;
	 }
	  return sum;
  }
  
}
