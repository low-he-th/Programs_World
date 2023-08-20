package FindPerfectNum;

public class FindPerfect {
public static int  CalculateDivisors(int i)
{
	int sum=0;
	for(int j=1;j<i;j++)
	{
		if(i%j==0)
		{
		sum=sum+j;
		}
	}
	return sum;
}
public static void PerfectNum(int num) {
	for(int i=1;i<num;i++)
	{
		int res=CalculateDivisors(i);
		if(i==res)
		{
			System.out.println(i);
		}
	}
}
}
