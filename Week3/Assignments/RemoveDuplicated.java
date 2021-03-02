package Week3.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "PayPal India";
		char[] charArray = input.toCharArray();

		Set<Character> newList = new LinkedHashSet<Character>();
		for (Character character : charArray) {
			if (character != ' ')
				newList.add(character);

		}

		for (Character character : newList) {

			System.out.print(character);
		}

	}

}
