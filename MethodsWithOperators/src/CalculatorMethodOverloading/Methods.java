package CalculatorMethodOverloading;

public class Methods {
public double  Calculate(int a,int b, char operator)
{
	switch(operator)
	{
	case '+':
		return a+b;
	case '-':
		return a-b;
	case '*':
		return a*b;
	case '/':
		if(b!=0) {
			return (int)a/b;
		}
		else {
			System.out.println("division not possible");
		}
	default:
		System.out.println("invalid operator");
	}
	return Double.NaN;
}
}
