package mergeArray;
import java.util.Arrays;
public class MergeArray {
public int[] merged(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length+arr2.length];
//	for(int i=0;i<arr1.length;i++) {
//		arr3[i]=arr1[i];
//	}
//	for(int i=0;i<arr2.length;i++) {
//		arr3[i+arr1.length]=arr2[i];
//	}
//	return arr3;
	System.arraycopy(arr1, 0, arr3, 0, arr1.length);
	System.arraycopy(arr2, 0, arr3, 0+arr1.length, arr2.length);
	return arr3;
}
}
