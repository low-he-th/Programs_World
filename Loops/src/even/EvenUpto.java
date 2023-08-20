package even;
/*Problem 4:
Write a Java program that uses a for loop to print the even numbers from 2 to 20.*/
public class EvenUpto {
public static void main(String[] args)
{
	for (int i=2;i<=20;i++)
	{
		if(i%2==0)
System.out.println(i);
	}
}
}