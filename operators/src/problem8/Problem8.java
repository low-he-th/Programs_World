package problem8;

import java.util.Scanner;

/*Problem 8:
Write a Java program that takes two boolean values as input from the user and 
performs logical AND, OR, and XOR operations on them using the appropriate operators.
 Display the results.
 */
public class Problem8 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the value of a");
	boolean a=scan.nextBoolean();
	System.out.println("enter the value of b");
	boolean b=scan.nextBoolean();
	System.out.println("logical AND opeartion : "+(a&&b));
	System.out.println("logical OR opeartion : "+(a||b));
	System.out.println("logical XOR opeartion : "+(a^b));
	scan.close();
}
}
