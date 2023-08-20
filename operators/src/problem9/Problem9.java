package problem9;

import java.util.Scanner;

/*Problem 9:
Write a Java program that takes a positive integer as input from the user and 
checks whether it is a prime number or not using the appropriate operators.
 Display an appropriate message based on the result.*/
public class Problem9 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number ");
     int  num=scan.nextInt();
     if(num<=1) {
    	 System.out.println("not prime");
     return;
     }
     for(int i=2;i<num;i++)
     {
    	 if(num%i==0)
    	 {
    		 System.out.println("number is not  prime");
    		 return;
    	 }
     }
     System.out.println("number is prime");
     scan.close();
}

}
