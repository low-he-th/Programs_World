package temperatureAverage;

import java.util.Scanner;

public class Temperaturs {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of temperatures");
	double arr[]=new double[scanner.nextInt()];
	System.out.println("enter the temperatures");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scanner.nextDouble();
	}
	CalculateTempAVG c=new CalculateTempAVG();
	double res=c.calculatetempkavg(arr);
	System.out.println("tempature average "+res);
}
}
