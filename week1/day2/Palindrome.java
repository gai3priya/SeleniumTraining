package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Build a logic to find the given string is palindrome or not

		System.out.println("Enter the string: ");
		Scanner input = new Scanner(System.in);
		String string = input.next();
		String revString = "";
		char[] array = string.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			revString = revString + array[i];
		}
		if (string.equals(revString))
			System.out.println("The String '" + string +"' is a palindrome");
		else
			System.out.println("The String '" + string + "' is not a palindrome");
	}

}
