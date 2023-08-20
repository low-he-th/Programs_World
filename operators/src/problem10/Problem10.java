package problem10;

import java.util.Scanner;

/*Write a Java program that takes a string as input from the user 
 * and checks whether it is a palindrome or not using the appropriate operators. 
 * Display an appropriate message based on the result.*/
public class Problem10 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the input");
String input =scan.next();
String reversed="";
for(int i=input.length()-1;i>=0;i--) 
{
	reversed+=input.charAt(i);
}
System.out.println(reversed);
if (input.equals(reversed)) {
	System.out.println("it is plaindrome");

}
else
System.out.println("not palindrome");
scan.close();
}
}

