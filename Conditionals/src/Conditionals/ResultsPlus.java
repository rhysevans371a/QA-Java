package Conditionals;

public class ResultsPlus {
	public static int chemistry;
	public static int physics;
	public static int biology;
	public static int total;
	public static double perc;

	public static void examTotals(int int1, int int2, int int3) {
		physics = int1;
		chemistry = int2;
		biology = int3;
		System.out.println("Your physics result is: " + physics);
		System.out.println("Your chemistry result is: " + chemistry);
		System.out.println("Your biology result is: " + biology);
		total = physics + chemistry + biology;
		System.out.println("Your total mark is: " + total);

	}

	public static void percentage() {
		perc = (total * 100) / 450;
		System.out.println("Your overall percentage is: " + perc + "%");
	}

	public static void passOrFail() {
		int counter = 0;
		if (physics < 60) {
			counter = counter + 1;
		}
		if (chemistry < 60) {
			counter = counter + 1;
		}
		if (biology < 60) {
			counter = counter + 1;
		}
		if (perc > 60 && counter < 1) {
			System.out.println("You passed");
		}
		if (perc<60 && counter<1) {
			System.out.println("You Failed.");
		}
		 else {
			switch (counter) {
			case 1:
				System.out.println("You failed one exam");
				break;
			case 2:
				System.out.println("You failed two exams");
				break;
			case 3:
				System.out.println("You failed three exams");
				break;
			}
		}
	}

	public static void main(String[] args) {
		examTotals(59, 90, 100);
		percentage();
		passOrFail();

	}

}
