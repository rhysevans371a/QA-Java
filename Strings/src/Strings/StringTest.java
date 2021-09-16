package Strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "yesterday it was raining";
		String second = "today it is sunny";
		String concat = first + ", " + second;
		System.out.println(concat.toUpperCase());

		String subStr1 = second.substring(0, 11);
		String subStr2 = first.substring(16, 24);
		System.out.println(subStr1 + subStr2);
	}

}
