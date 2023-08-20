package guessTheNum;

import java.util.Random;
import java.util.Scanner;

public class LetsPlay {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the Guess the Number Game!\r\n"
			+ "\r\n"
			+ "I have selected a random number between 1 and 100. Try to guess it!");
	Random random=new Random();
	int opponent=random.nextInt(1,100);
	
	
	while(true) {
		System.out.println("Enter your guess");
		int num=scan.nextInt();
		if(num>opponent)
		{
			System.out.println("too high  ! try again");
		}
		else if(num<opponent)
		{
			System.out.println("too low !try again");
		}
		else
		{
			System.out.println("congrats you won.");
			break;
		}
		
	}
	
}
}
