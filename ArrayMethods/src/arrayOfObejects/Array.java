package arrayOfObejects;

public class Array {
public static void main(String[] args) {
	Student[] student=new Student[3];
	student[0]=new Student("lohi",20);
	student[1]=new Student("kohi",30);
	student[2]=new Student("fofi",40);
	
	for(Student x:student)
	{
		x.display();
		
	}
}
}
