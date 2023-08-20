package rectangle;

import java.util.Scanner;

/*Problem 2:
Create a class named Rectangle with attributes length and width. Include methods to calculate the area and perimeter of the rectangle. Write a program to create an instance of the Rectangle class, set its attributes, and display the calculated area and perimeter.*/
public class RectangleApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the length of rectangle");
	double length=scan.nextDouble();
	System.out.println("enter the width of rectangle");
	double width=scan.nextDouble();
  Rectangle	r=new Rectangle(length,width);
System.out.println("length of rectangle "+r.length);
System.out.println("width of rectangle "+r.width);
System.out.println("area of rectangle "+r.calculateArea());
System.out.println("perimeter of rectanglr "+r.calculatePerimeter());
}
}
