package reverseString;
/*Problem 2:
Write a Java method that takes a string as a parameter and returns the string in reverse order.
 Use this method to reverse and display a string provided by the user.*/
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the string ");
		String name=scan.nextLine();
		reverseString(name);
}
public static void  reverseString(String name) {
	//StringBuilder reversed=new StringBuilder();
	String reversed="";
	for (int i=name.length()-1;i>=0;i--)
	{
		reversed=reversed+name.charAt(i);
		 // reversed.append(name.charAt(i));
		
	}
	System.out.println("reversed string is "+reversed);
	if (name.equals(reversed.toString())) 
	{
		System.out.println("it is palindrome");
	}
	else 
	{
		System.out.println("it is not palindrome");
	}
}
}
