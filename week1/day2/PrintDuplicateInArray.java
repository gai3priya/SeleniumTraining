package week1.day2;

import java.util.Arrays;

public class PrintDuplicateInArray {

	public static void main(String[] args) {

		// Find duplicates i the array {14,12,13,11,15,14,18,16,17,19,18,17,20}

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 14, 17, 18, 18, 18, 17, 20 };

		/*
		 * Arrays.sort(arr); System.out.println("Sorted array is "); for (int i = 0; i <
		 * arr.length; i++) { System.out.println(arr[i]); }
		 * 
		 * System.out.println("Duplicates in the array are:"); for (int i = 1; i <
		 * arr.length; i++) {
		 * 
		 * if (arr[i] == arr[i - 1]) System.out.println(arr[i]);
		 * 
		 * }
		 * 
		 * This will print duplicateslength
		 */

		for (int j = 0; j < arr.length; j++) {

			int count = 1;

			for (int k = j + 1; k < arr.length; k++) {

				if (arr[j] == arr[k]) {

					count++;
					arr[k] = 0;

				}

			}

			if (count > 1 && arr[j] != 0)
				System.out.println(arr[j]);

		}

	}

}
