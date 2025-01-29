package Array;

import java.util.Scanner;

public class MaxAndMin {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for the size of the array
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Array size must be greater than 0.");
	            return;
	        }

	        // Initialize the array
	        int[] numbers = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // Find the maximum and minimum values
	        int max = numbers[0];
	        int min = numbers[0];

	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	            if (num < min) {
	                min = num;
	            }
	        }

	        // Display the results
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);

	        scanner.close();
	    }
	}
