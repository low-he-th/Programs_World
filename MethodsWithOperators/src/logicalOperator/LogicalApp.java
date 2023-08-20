package logicalOperator;

import java.util.Scanner;

public class LogicalApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the input 1");
	boolean input1=scan.nextBoolean();
	System.out.println("enter the input 2");
	boolean input2=scan.nextBoolean();
	LogicalOperatorValidate l=new LogicalOperatorValidate();
	boolean res=l.isValidInput(input1, input2);
	if(res==true)
	{
		System.out.println("Input is valid.");
	}
	else
	{
		System.out.println("Input is not valid.");
	}
}
}
