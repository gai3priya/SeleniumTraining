package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series for a given range
		// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13

		Scanner input = new Scanner(System.in);
		int sum = 0, number1 = 0, number2 = 1;
		System.out.println("Enter the range");

		int range = input.nextInt();

		for (int i = 0; i <= range; i++) {

			System.out.print(number1 + ", ");
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;

		}

	}

}
