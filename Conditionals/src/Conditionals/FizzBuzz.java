package Conditionals;

public class FizzBuzz {

	public static void fizz(int num) {
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else

		{
			System.out.println(num);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizz(7);
	}

}
