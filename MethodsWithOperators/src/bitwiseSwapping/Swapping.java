package bitwiseSwapping;

public class Swapping {
public static void swapUsingBitwise(int num1,int num2)
{
	System.out.println("befor swapping num1: "+num1+" num2: "+num2);
     int help=num1^num2;
     num2=help^num2;
     num1=help^num2;
     System.out.println("after swapping num1: "+num1+" num2: "+num2);
     
     
}
}
