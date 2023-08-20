package primeRangeFinder;

public class PrimeRange {
public static boolean Findprime(int i)
{
	if(i<0||i==1)
	{
		return false;
	}
	else
	{
		for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
	}
	return true;
}
public static void PrimeRangeFinder(int num1,int num2)
{
	for(int i=num1;i<=num2;i++)
	{
		if(Findprime(i)) {
		System.out.println(i);
	}
	}
}
}
