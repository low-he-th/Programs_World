package primeRangeFinder;

import java.util.Scanner;

public class PrimeFinderApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	PrimeRange.PrimeRangeFinder(num1, num2);
}
}
