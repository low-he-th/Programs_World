package DuplicateElements;

public class Duplicateelements {
public static void main(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Duplicate elements are present at "+j );
			}
		}
	}
}
}
