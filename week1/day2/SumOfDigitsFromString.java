package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// To find the sum of digits in the String

		String input = "Tes12Le79af655";

		int sum = 0;

		String digitString = input.replaceAll("[a-zA-Z]", "");

		System.out.println("The string without alphabets is : " + digitString);

		char[] charArray = digitString.toCharArray();

		for (char c : charArray) {
			sum = sum + Character.getNumericValue(c);

		}

		System.out.println("The Sum of the digits are : " + sum);
	}

}
