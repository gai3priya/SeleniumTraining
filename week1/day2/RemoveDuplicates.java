package week1.day2;

//import java.util.*; 
//import org.apache.commons.lang.ArrayUtils;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// To remove duplicate strings in the string

		String input = "We learn java basics as part of java sessions in java week1";

		String[] array = input.split(" ");

		String[] dupArray = array;

		int j, count = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			count = 0;


			for (j = 0; j < dupArray.length; j++) {
				if (array[i].equals(dupArray[j]))
					count++;
				
			}
			if (count > 1)
				array[i]= "";
		}
		
		for (String string : array) {
			System.out.print(string + " ");

		}

	}

}
