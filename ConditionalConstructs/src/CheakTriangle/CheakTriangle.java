package CheakTriangle;
/*Problem 8:
Write a Java program that takes three sides of a triangle as input from the user and
 determines whether the triangle is equilateral, isosceles, or scalene using conditional statements.
 Display an appropriate message based on the result*/
import java.util.Scanner;

public class CheakTriangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the sides of triangle");
	int side1=scan.nextInt();
	int side2=scan.nextInt();
	int side3=scan.nextInt();
	if(side1==side2&&side2==side3)
	{
		System.out.println("it is equilateral triangle");
	}
	else if((side1==side2)||(side1==side3)||(side2==side3))
	{
		System.out.println("isocelsus triangle ");
	}
	else
		System.out.println("scalene triangle");
	scan.close();
}
}
