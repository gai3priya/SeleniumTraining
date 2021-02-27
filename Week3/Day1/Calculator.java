//		Assignment 1:
//			Create class Calculator with below methods
//			- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
//			- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
//			- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
//			- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
//			create object for the Calculator class and execute all the methods

package Week3.Day1;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double multiply(int a, double b) {
		return a * b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public double divide(double a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Add 1 and 2 :" + calc.add(1, 2));
		System.out.println("Add 1 and 2 and 3 :" + calc.add(1, 2, 3));
		System.out.println("Substract 5 and 2 :" + calc.substract(5, 2));
		System.out.println("Substract 10.5 and 5.3 :" + calc.substract(10.5,5.3));
		System.out.println("Multiply 1 and 2 :" + calc.multiply(1, 2));
		System.out.println("Multiply 1 and 5.5 :" + calc.multiply(1, 5.5));
		System.out.println("Divide 10 and 2 :" + calc.divide(10, 2));
		System.out.println("Divide 10.8 and 2 :" + calc.divide(10.8, 2));
		System.out.println("Add 1 and 2 :" + calc.add(1, 2));
	}

}
