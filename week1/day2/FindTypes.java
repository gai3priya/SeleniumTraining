package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// FindTypes: letter = 0, space = 0, num = 0, specialChar = 0;

		String string = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArray = string.toCharArray();

		for (char c : charArray) {
			if (c == '$')
				specialChar++;
			else if (c == ' ')
				space++;
			else if (Character.isLetter(c))
				letter++;
			else if (Character.isDigit(c))
				num++;

		}
		System.out.println("Letter = " + letter + " Space = " + space + " Number = " + num + " Special Character ="
				+ specialChar + " ");

	}

}
