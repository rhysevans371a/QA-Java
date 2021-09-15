package Calculator;

public class Results {

	public static int examTotals(int physics, int chemistry, int biology) {
		System.out.println("Your physics result is: " + physics);
		System.out.println("Your chemistry result is: " + chemistry);
		System.out.println("Your biology result is: " + biology);
		int total = physics + chemistry + biology;
		System.out.println("Your total mark is: " + total);
		System.out.println("Your overall percentage is: " + percentage(total) + "%");
		return total;


		
	}
	public static double percentage (int total) {
		double perc;
		perc = (total*100)/450;
		return perc;
	}
	public static void main(String[] args) {
		examTotals(85, 90, 100);
		
	}
	

}
