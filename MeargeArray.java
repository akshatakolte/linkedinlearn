package Array;

import java.util.Arrays;

public class MeargeArray {
	public static int[] meargeArrays(int[] arr1, int[] arr2) {

		int[] meargeArray = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, meargeArray, 0, arr1.length);

		// Copy the elements of the second array into the merged array
		System.arraycopy(arr2, 0, meargeArray, arr1.length, arr2.length);

		return meargeArray; // Return the merged array
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		// Merge the two arrays
		int[] mergedArray = meargeArrays(arr1, arr2);

		// Output the merged array
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

}
