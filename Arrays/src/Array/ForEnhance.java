package Array;

public class ForEnhance {
	public static boolean isEven(int num) {
		if (num%2==0) {
		return true;}
		else {
		return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arrayString = {"A", "new", "array", "string", "for", "this","exercise"};
		for (String i : arrayString) {
			System.out.print(i + " ");
		}
		int [] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i:ints) {
			System.out.println(i*i);
		}
		System.out.println(isEven(10));
	}

}
