package Conditionals;

public class Blackjack {
	public static int play(int int1, int int2) {
		int blackjack = 0;
		if (int1 > int2 && int1 < 21) {
			blackjack = int1;
		}
		if (int2 > int1 && int2 < 21) {
			blackjack = int2;
		}
		if (int1 > 21 && int2 > 21) {
			blackjack = 0;
		}
		return blackjack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(play(21, 22));
	}

}
