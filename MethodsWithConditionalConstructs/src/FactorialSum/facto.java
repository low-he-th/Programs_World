package FactorialSum;

public class facto {
	public	static int factorialsums(int limit)
	{
		int factorialsum=0;
		for(int i=1;i<=limit;i++)
		{
			factorialsum+=factorial(i);
		}
		return factorialsum;
	}

	public static int factorial(int n) 
	{
		if(n==0||n==1) {
			return 1;
		}else {
		int factorial=1;
		for(int i=2;i<=n;i++)
		{
			factorial*=i;
		}
		return factorial;
	}
	}
}

