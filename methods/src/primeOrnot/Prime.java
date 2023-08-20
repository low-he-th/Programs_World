package primeOrnot;
/*Write a Java method that takes an integer as a parameter and checks whether it is a prime number or not. The method should return a boolean value (true if prime, false if not).
 *  Use this method to check and display whether a number provided by the user is prime or not.*/
 
import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	Cheakprime cp=new Cheakprime();
	boolean res=cp.PrimeotNot(num);
	if(res) {
		System.out.println("it is prime ");
	}else
		System.out.println("it is not prime ");
}

	
}


