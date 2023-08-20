package charcheak;
/*
Problem 4:
Write a Java program that takes a character as input from the user and 
checks whether it is a vowel or a consonant using conditional statements.
 Display an appropriate message based on the result*/
import java.util.*;

public class Charcheak {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	char ch =scan.next().charAt(0);
	if(Character.isLowerCase(ch)) 
	{
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println("it is a lower case vowel");
	}else
		System.out.println("it is lower case consonant");
	}
	else if (Character.isUpperCase(ch))
	{
		if(ch=='A'||ch=='O'||ch=='I'||ch=='E'||ch=='U')
		{
			System.out.println(" it is upper case vowel");
		}
		else
		{
			System.out.println("it is upper case consonants ");
		}
	}
	else if(Character.isDigit(ch))
	{
		System.out.println("it  is digit ");
	}
	else {
		System.out.println("it is special symbol");
	}
	scan.close();
}
}
