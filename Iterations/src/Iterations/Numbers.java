package Iterations;

public class Numbers {
	public static int numberAdd(int num) {
		int firstnum = num / 10;
		int secondnum = num % 10;
		int total = 0;
		total = firstnum + secondnum;
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberAdd(67));
	}

}
