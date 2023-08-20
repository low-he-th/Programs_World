package problem2;

import java.util.Scanner;

/*Problem 2:
Write a Java program that reads a number from the user
and checks whether it is even or odd using the modulus operator (%). 
Display an appropriate message based on the result.*/

public class Problem2 {
public static void main(String[] args) {
Scanner scan =new Scanner (System.in);
System.err.println("enter the number ");
     while(true){
		float n=scan.nextFloat();
		if (n%2==0)
    {
    	System.out.println("number is even");
    }
    else
    {
    System.out.println("number is odd");
    }
    System.out.println("enter the number Again");
   
}
}
}
