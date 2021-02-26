package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		
		int count=0;
		
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			
			if (c=='e') {
				count++;
			}
				
			
		}

		System.out.println("The Character e occurs "+ count+ " times");
	}

}
