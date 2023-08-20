package prime;

import java.util.Scanner;

/*Problem 8:
Write a Java program that uses a while loop to 
find and display all the prime numbers.*/
public class PrimeNum {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int i=1;
	System.out.println("enter the number");
	int n=scan.nextInt();
	System.out.println("prime numbers from "+i+" to "+n);
	while(i<=n) {
		if(isprime(i))
		{
			System.out.println(i);
		}
		i++;
	}
	scan.close();
}
public static boolean isprime(int num) {
	if (num<=1) {
		return false;
	}
	for (int i=2;i<=Math.sqrt(num);i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
}
}
