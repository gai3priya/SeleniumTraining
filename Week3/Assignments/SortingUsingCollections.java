package Week3.Assignments;

import java.util.Arrays;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		Arrays.sort(input);
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.println(input[i]);
		}

	}

}
