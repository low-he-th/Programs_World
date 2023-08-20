package array;

public class FindingMaxMin {
public static int[] logic(int arr[]) {
	int max=Integer.MIN_VALUE;
	int min =Integer.MAX_VALUE;
	for(int element :arr)
	{
		if(element>max) {
			max=element;
		}
		 if (element<min) {
			 min=element;
		 }
	}
	int res[]= {max,min};
	return res;
}
}
