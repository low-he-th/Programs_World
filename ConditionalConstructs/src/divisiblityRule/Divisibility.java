package divisiblityRule;
/*Problem 10:
Write a Java program that takes a number as input from the user and 
checks whether it is divisible by both 3 and 5 using conditional statements.
 Display an appropriate message based on the result.*/
import java.util.Scanner;

public class Divisibility {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	System.out.println(num%3==0?"it is divisible by 3":"it is not divisible by 3");
	System.out.println(num%5==0?"it is divisible by 5":"it is not divisible by 5");
	System.out.println((num%3==0&&num%5==0)?"it is divisible by both 3,5":"it is not divisible by 3,5");
scan.close();
}
}
