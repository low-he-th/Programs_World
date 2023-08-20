package temperatureAverage;

public class CalculateTempAVG {
int calculatetempkavg(double arr[])
{
	int sum=0;
for(double x:arr)
{
	sum+=x;
}
return sum/arr.length;
}
}
