package Conditionals;

public class UniqueSum {
	public static int unique(int int1, int int2, int int3) {
		int sum = 0;
		if (int1 != int2 && int1 != int3) {
			sum = int1;
		}
		if (int1 != int3) {
			sum = sum + int3;
		}
		if (int1 != int2) {
			sum = sum + int2;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unique(0, 0, 0));
	}

}
