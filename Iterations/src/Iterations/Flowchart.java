package Iterations;

public class Flowchart {
	public static void flow1() {
		for (int i=100; i<=200; i++) {
			System.out.println("A");
		}
	}
	public static void flow2() {
		for (int i=100; i<=200;) {
			if (i%2==0) {
				System.out.println("-");
				i++;
			}
			else {
				System.out.println("*");
				i++;
			}
		}
	}
	public static void flow3() {
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.println(i);
			}
		}
			
	}
	public static void flow5() {
		for (int i=1; i<=10; i++) {
			int count =0;
			while (count<i) {
				System.out.println(i);
				count++;
				
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		flow1();
//		flow2();
//		flow3();
		flow5();
	}
}
