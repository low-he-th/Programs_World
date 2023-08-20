package bitwiseSwapping;

import java.util.Scanner;

public class BitwiseSwapper {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number1");
	int num1=scan.nextInt();
	System.out.println("enter the number2");
 int num2=scan.nextInt();
 Swapping.swapUsingBitwise(num1, num2);
 
}
}
