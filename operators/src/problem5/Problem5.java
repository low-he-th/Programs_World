package problem5;

import java.util.Scanner;

public class Problem5 {
public static void main(String[] args) {
Scanner scan =new Scanner (System.in); 
System.out.println("enter the number ");
	int number =scan.nextInt();
    int reversed =0;
	while(number!=0)
	{
    int lastdigit =number %10;//extracts last digit of given number ;
	 reversed =reversed*10+lastdigit;//adds last digit ;
	number =number/10;//removes last digit from number ;
	
	}
	System.out.print("reversed number is  "+ reversed );
	scan.close();
}
}

