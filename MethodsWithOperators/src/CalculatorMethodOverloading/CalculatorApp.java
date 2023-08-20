package CalculatorMethodOverloading;

import java.util.Scanner;

public class CalculatorApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the first  number");
	int a=scan.nextInt();
	System.out.println("enter the second  number");
	int b=scan.nextInt();
	System.out.println("choose  + or - or * or /" );
	System.out.println("enter the operator to perform operation ");
	char operator=scan.next().charAt(0);
	Methods m=new Methods();
	double res=m.Calculate(a, b, operator);
	System.out.println("result: "+res);
}
}
