package student;

import java.util.Scanner;

/*Problem 3:
Create a class named Student with attributes name, rollNumber, and an array marks to store marks in three subjects. Include methods to calculate the total marks and average marks of the student. Write a program to create an instance of the Student class, set its attributes, and display the total and average marks.*/
public class StudentApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter name ");
	String name=scan.next();
	System.out.println("enter rollno");
	int rollno=scan.nextInt();
	System.out.println("entre the subjects");
	int marks[]=new int[scan.nextInt()];
	System.out.println("enter the marks of each subject ");
	for(int i=0;i<marks.length;i++) {
		marks[i]=scan.nextInt();
	}
	Student s=new Student(name,rollno,marks);
	System.out.println("name of student is "+s.name);
	System.out.println("rolno of student "+s.rollno);
	System.out.println("totalmarks of student "+s.calculateTotalMarks());
	System.out.println("average of the student is "+s.calculateAverage());

}
}
