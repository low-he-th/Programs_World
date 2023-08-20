package student;

public class Student {
String name;
int rollno;
int marks[];
  public Student(String name,int rollno,int marks[] )
  {
	  this.name=name;
	  this.rollno=rollno;
	  this.marks=marks;
  }
  int calculateTotalMarks() {
	  int totalmarks=0;
	  for(int x:marks) {
		  totalmarks=totalmarks+x;
	  }
	  return totalmarks;
	  
  }
  int calculateAverage() {
	  int Totalmarks=calculateTotalMarks();//constructor chaining
	  return Totalmarks/(marks.length);
  }
}
