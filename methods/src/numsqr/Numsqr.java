package numsqr;

import java.util.Scanner;

/*Problem 8:
Write a Java method that takes a double value and calculates the square root using the Math library. Use this method to calculate and display the square root of a number provided by the user.*/
public class Numsqr {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the num");
	double num=scan.nextInt();
	System.out.println("squared number is "+Numsqring(num));
}
 static double Numsqring(double num) {
	double sqr=Math.sqrt(num);
	return sqr;
}
}
