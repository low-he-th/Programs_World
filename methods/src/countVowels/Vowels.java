package countVowels;
/*Problem 5:
Write a Java method that takes a string as a parameter and counts the number of vowels (a, e, i, o, u) in the string. Use this method to count and 
display the number of vowels in a string provided by the user.*/
import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the word");
	String word =scan.nextLine();
	System.out.println("number of vowels in word is "+cheakVowel(word));
}
public static int cheakVowel(String word) {
	int count =0;
	String  str=word.toLowerCase();
	for (int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if (c=='a'||c=='e'||c=='o'||c=='i'||c=='u') 
		{
		count++;
}
	}
	return count++;
}
}
