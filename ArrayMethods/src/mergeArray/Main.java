package mergeArray;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array lenght");
	int arr1[]=new int[scan.nextInt()];
	System.out.println("enetr the arr1 elements");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=scan.nextInt();
		
	}
	System.out.println("enter the array 2 lenght");
	int arr2[]=new int[scan.nextInt()];
	System.out.println("enetr the arr2 elements");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=scan.nextInt();
	}
 MergeArray	mergedarray=new MergeArray();
 int res[]=mergedarray.merged(arr1,arr2);
 for(int x:res) {
	 System.out.print(x+" ");
 }
	

}
}
