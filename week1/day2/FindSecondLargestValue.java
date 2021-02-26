package week1.day2;

import java.util.Arrays;

public class FindSecondLargestValue {

	public static void main(String[] args) {
		// TODO Find the second largest in the array {3,2,11,4,6,7};

		int[] data = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(data);
		//Arrays.parallelSort(data);
		System.out.println("Data in the array are : ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		System.out.println("The second largest in the array is " + data[data.length - 2]);

	}
}
