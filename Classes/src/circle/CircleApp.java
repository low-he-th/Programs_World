package circle;

import java.util.Scanner;

/*Problem 1:
Create a class named Circle with attributes radius and color. Include methods to calculate the area and circumference of the circle. Write a program to create an instance of the Circle class, set its attributes, and display the calculated area and circumference.*/
public class CircleApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the radius of circle");
	double radius=scan.nextDouble();
	System.out.println("enter the colour of circle");
	String colour=scan.next();
	
 CircleAreaCircum c=new CircleAreaCircum(radius, colour);
 System.out.println("raduis is" +c.radius);
 System.out.println("colur is "+c.colour);
 System.out.println("area of circle "+c.calculatearea());
 System.out.println("circumference if circle "+c.calculatecircumference());
 
}
}
