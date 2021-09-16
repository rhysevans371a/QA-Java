package Conditionals;

public class CalculatorPlus {
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
	public static double Division(int int1, int int2) {
		double value = 0;
		if (int2<int1) {
			value = int1 / int2;
		}
		else {
			System.out.println("Division cannot be performed");
		}
			
		return value;
	}

	public static void main(String[] args) {
		System.out.println(Addition(20, 15));
		System.out.println(Subtraction(20, 15));
		System.out.println(Multiplication(20, 15));
		System.out.println(Division(10, 15));

	}

}
