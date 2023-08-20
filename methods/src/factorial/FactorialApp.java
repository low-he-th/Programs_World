package factorial;
/*Problem 6:
Write a Java method that takes an integer as a parameter and calculates the factorial of that number. Use this method to calculate and
 display the factorial of a number provided by the user.*/
import java.util.Scanner;

public class FactorialApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number ");
	int num=scan.nextInt();
	System.out.println("factorial of given number is "+FindFactorial.logic(num));
	scan.close();
}
}
