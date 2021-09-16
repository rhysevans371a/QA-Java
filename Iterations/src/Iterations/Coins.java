package Iterations;

public class Coins {
	
	public static void change(double cost, int note) {
		double change = note - cost;
		int ten£ = (int) (change/10);
		change = change%10;
		int five£ = (int) change/50;
		change = change%5;
		int one£ = (int) change/1;
		change = change%1;
		change = (int) Math.ceil(change*100);
		int twenty = (int) change/20;
		change = change%20;
		int ten = (int) change/10;
		change = change%10;
		int five= (int) change/5; 
		change = change%5;
		int two = (int) change/2;
		change = change%2;
		System.out.println("£10 - " + ten£);
		System.out.println("£5 - " + five£);
		System.out.println("£1 - " + one£);
		System.out.println("20p - " + twenty);
		System.out.println("10p - " + ten);
		System.out.println("5p - " + five);
		System.out.println("2p - " + two);
		System.out.println(change);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change(2.48, 20);
		
	}

}
