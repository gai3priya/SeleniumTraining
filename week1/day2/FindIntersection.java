package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// To print the numbers present in both the arrays

		int[] firstArray = { 3, 2, 11, 4, 6, 7 };
		int[] secondArray = new int[] { 1, 2, 8, 4, 9, 7};
		
		for (int i : firstArray) {
			for (int j : secondArray) {
				if (i == j)
					System.out.println(i);
				else
					continue;

			}
		}

	}

}
