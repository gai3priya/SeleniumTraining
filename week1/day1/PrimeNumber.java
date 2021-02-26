package week1.day1;

public class PrimeNumber {

	static int number = 61;
	//int number =583;

	public static void main(String[] args) {

		PrimeNumber pm = new PrimeNumber();
		
		if (pm.isPrimeNumber(number))
			System.out.println(number + " is a PrimeNumber");
		else
			System.out.println(number + " is not a prime Number");
	}

	public boolean isPrimeNumber(int num) {

		if (num == 1)
			return false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
			else
				return true;
		}
		return false;
	}
}

