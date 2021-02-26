package week1.day2;

public class AmstrongNumbers {

	public static void main(String[] args) {
		// TODO print Amstrong numbers 153 = output: (1*1*1)+(5*5*5)+(3*3*3) = 153

	
		int number = 155;
		int aNum = 0;
		int i = 0, num = number;

		while (number > 0) {
			i = number % 10;
			aNum = aNum + (i * i * i);
			number = number / 10;
		}

		if (aNum == num) {
			System.out.println(num + " is a Amstrong Number");
		} else
			System.out.println(num + " is not a Amstrong Number");
	}

}
