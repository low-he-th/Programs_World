package problem6;

import java.util.Scanner;

/*Write a Java program that takes a four-digit number as input from the user 
 * and calculates the sum of its digits using arithmetic operators. Display the result.
 */
public class Problem6 {
public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.err.println("enter the number ");
	int num =scan.nextInt();
	int sum=0;
	for(int i=0;num>0;num/=10)//(num/10) removes last digit of given num. 
	{
		int lastdigit=num%10;//this gives the last digit as a reaminder.
		sum+=lastdigit;//add the last digit.
	}
			System.out.println(sum);
scan.close();
}
}
