package Calculator;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println("addtion result is "+sum(num1,num2));
	System.out.println("multiplication result is "+mul(num1,num2));
	System.out.println("div result is "+div(num1,num2));
	System.out.println("is numbers are equal ? "+xyz(num1,num2));
	System.out.println("remainder is  "+Mod(num1,num2));
	System.out.println("square root of given number is "+sqrt(num1));
	System.out.println("cube of given number is "+cube(num1));
	scan.close();
}
public static int  sum(int num1,int num2) {
	return (num1+num2);	
}
public static int  mul (int num1 ,int num2) {
	return (num1*num2);
}
public static float div(float num1,float num2) {
	return(num1/num2);
}
public static boolean xyz(int num1,int num2) {
	return (num1==num2);
}
public static int Mod(int num1,int num2) {
		return(num1%num2);
}
public static double sqrt(int num1)
{
	return(Math.sqrt(num1));
}
public static double  cube(int num1) {
	return (Math.cbrt(num1));
}

}
