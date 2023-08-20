package Arraymethods;
import java.util.Arrays;

public class ArrMethods {
public static void main(String[] args) {
	          //array methods// 
              
	     
	         // Declare and initialize an array
	         int[] arr = {5, 2, 8, 1, 6};
	         //1.length: Returns the length of an array.
	         System.out.println("array lenght is "+arr.length); 

	         // 2.Print the original array
	         System.out.println("Original Array: " + Arrays.toString(arr));

	         //  3.Sort the array
	         Arrays.sort(arr);
	         System.out.println("Sorted Array: " + Arrays.toString(arr));

	         //  4.Fill the array with a specific value
	         int[] filledArray = new int[5];
	         Arrays.fill(filledArray, 10);
	         System.out.println("Filled Array: " + Arrays.toString(filledArray));

	         // 5.Copy a portion of the array
	         int[] copiedArray = Arrays.copyOfRange(arr, 1, 4);
	         System.out.println("Copied Array: " + Arrays.toString(copiedArray));

	         //6.Check for equality between two arrays
	         int[] arr2 = {5, 2, 8, 1, 6};
	         boolean equalArrays = Arrays.equals(arr, arr2);
	         System.out.println("Arrays equal? " + equalArrays);

	         //7.Check if an array contains a specific value
	         int value = 6;
	         boolean containsValue = Arrays.asList(arr).contains(value);
	         System.out.println("Array contains " + value + "? " + containsValue);
	     }
}

