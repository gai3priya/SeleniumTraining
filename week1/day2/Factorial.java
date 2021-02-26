package week1.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Find factorial number > input: 5 -> output: 5*4*3*2*1 = 120
		int product=1;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int num = input.nextInt();
		
		for (int i = num; i>0; i--) {
			product = product * i;
		}
		System.out.println("The factorial number is : " +product);

	}

}
