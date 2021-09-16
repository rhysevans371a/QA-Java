package Conditionals;

public class Flowchart {

	public static int flow(int int1, int int2, boolean bool) {
		int total =0;
		if (bool==true) {
			total = int1 + int2;
		}
		else {
			total = int1 * int2;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(flow(10, 20, true));

	}

}
