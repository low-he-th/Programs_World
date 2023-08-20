package FactorialSum;

import java.util.Scanner;

public class Factrioalsum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	
	int res=facto.factorialsums(n);
	System.out.println("sum of "+ n+" factorials "+res);
}
}
