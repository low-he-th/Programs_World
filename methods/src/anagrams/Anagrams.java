package anagrams;

import java.util.Arrays;
import java.util.Scanner;

/*Problem 10:
Write a Java method that takes two strings as parameters and checks whether they are anagrams (contain the same characters but in a different order). The method should return a boolean value (true if anagrams, false if not). Use this method to check and display whether two strings provided by the user are anagrams or not.*/
public class Anagrams {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("eneter two words");
	String word1=scan.nextLine();
	String word2=scan.nextLine();
	 boolean res=cheakAnagrams(word1,word2);
	if(res) {
		System.out.println("they are anagrams");
	}
	else
	{
		System.out.println("they are not anagrams");
	}
}
public static boolean cheakAnagrams(String a,String b) {
	String str1=a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	String str2=b.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	if(str1.length()!=str2.length()){
		return false;
	}
	char []arr=str1.toCharArray();
	char []arr2=str2.toCharArray();
	Arrays.sort(arr);
	//System.out.println(arr);
	Arrays.sort(arr2);
	//System.out.println(arr2);
	return Arrays.equals(arr,arr2);
	
	
}
}
