package grade;
/*Problem 7:
Write a Java program that takes a grade as input from the user (A, B, C, D, or F) and displays an appropriate message based on the grade using conditional statements.
 For example, if the grade is "A," display "Excellent work!"*/
import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the grade");
	char ch=scan.next().charAt(0);
	ch =Character.toUpperCase(ch);
	switch (ch) {
	case('A'):
		System.out.println("exellent");
	break;
	case('B'):
		System.out.println("very good");
	break;
	case('C'):
		System.out.println("good");
	break;
	case('D'):
		System.out.println("need to work more ");
		break;
	case('F'):
		System.out.println("failed");
	break;
	}
	scan.close();
}
}
