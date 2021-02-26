package week2.day2;

import java.util.ArrayList;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "We learn java basics as part of java sessions in java week1";

		String[] array = input.split(" ");

		ArrayList<String> finalArray = new ArrayList<String>();

		for (String string : array) {
			if (finalArray.contains(string)) {
				continue;
			} else
				finalArray.add(string);
		}

		for (String string : finalArray) {
			System.out.print(string + " ");

		}

	}

}
