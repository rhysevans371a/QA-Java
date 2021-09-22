package Scanner;

import java.util.Scanner;

public class Calculator {
	private static int int1, int2;

	public static int Addition(int int1, int int2) {
		int value = 0;
		value = int1 + int2;
		return value;
	}

	public static int Multiplication(int int1, int int2) {
		int value = 0;
		value = int1 * int2;
		return value;
	}

	public static int Subtraction(int int1, int int2) {
		int value = 0;
		value = int1 - int2;
		return value;
	}

	public static double Division(int int1, int int2) throws ArithmeticException {
		double value = 0;
		try {
			value = int1 / int2;
		} catch (ArithmeticException e) {
			System.out.println("Can't be divided by 0, The message:" + e);
		}
		return value;
	}

	public static double Division2(int int1, int int2) throws ArithmeticException, DivisionException {
		double value = 0;
		if (int2 == 0) {
			throw new ArithmeticException("Can't divide by 0");
		} else if (int1 < int2) {
			throw new DivisionException("Can't divide by larger number " + int2 + "needs to be smaller");
		} else {
			value = int1 / int2;
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int1 = scan.nextInt();
		System.out.println("Please enter second number");
		int2 = scan.nextInt();
		System.out.println(
				"What operation would you like to use?\n 1: Addition\n 2: Multiplication\n 3: Substraction\n 4: Division");
		int choice = scan.nextInt();
		switch (choice) {

		case 1: {
			System.out.println(Addition(int1, int2));
			break;
		}
		case 2: {
			System.out.println(Multiplication(int1, int2));
			break;
		}
		case 3: {
			System.out.println(Subtraction(int1, int2));
			break;
		}
		case 4: {
			
			try {
				System.out.println(Division2(int1, int2));
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DivisionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

		}
		scan.close();
	}

}