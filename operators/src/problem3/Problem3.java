package problem3;

import java.util.Scanner;

/*Problem 3:
Write a Java program that takes a radius as input from the user and
 calculates the area and circumference of a circle
  using the appropriate operators. Display the results.*/
public class Problem3 {
public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
System.out.println("enter the radius of circle");
float radius=scan.nextFloat();
System.out.println("area of the circle is "+ (Math.PI*radius*radius));
scan.close();
}
}