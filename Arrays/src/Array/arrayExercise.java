package Array;

public class arrayExercise {
	public static int [] values = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i: values) {
            values[i] = (int) (Math.random() * 100);
    		for (int j =0; j<values.length; j++) {
                System.out.print(values[i] + " ");
            	System.out.println((int)(values[j]*10));
            }
            }


	

}
}