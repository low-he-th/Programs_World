package cheakPassword;
/*Problem 6:
Write a Java program that uses a do-while loop to ask the user for a password. 
The program should keep asking until the user enters the correct password. 
Display a success message when the correct password is entered.*/
import java.util.Scanner;

public class Passwordcheaking {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	do {
		System.out.println("enter the password");
		String password=scan.next();
		if (password.equals("lohi")) {
			System.out.println("hello! device unlocked");
			break;
		}else
			System.out.println("incorrect password ,please try again");
	}while(true);
}
}
