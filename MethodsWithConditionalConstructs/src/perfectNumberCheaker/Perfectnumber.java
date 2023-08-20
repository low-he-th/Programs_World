package perfectNumberCheaker;

import java.util.Scanner;

public class Perfectnumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int res =PerfectNumCheaker.NumDivisors(num);
	if(num==res)
	{
		System.out.println("It is a perfect number");
		
	}
	else
	{
		System.out.println("it is not perfect number");
	}
	}
}
