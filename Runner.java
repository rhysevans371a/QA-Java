package Encapsulate;

public class Runner {

	public static void main(String[] args) {
//		create new instance
		Encapsulation encap = new Encapsulation();
//	use setters to initialise variables	
		encap.setName("Barry");
		encap.setAge(32);
		encap.setWeight(75.6);
		encap.setHeight(176.5f);
		encap.setNhsNumber(123456);
//	use getters to output values
		System.out.println("Name: " + encap.getName());
		System.out.println("Age: " + encap.getAge());
		System.out.println("Weight: " + encap.getWeight()+ "kg");
		System.out.println("Height: " + encap.getHeight() + "cm");
		System.out.println("NHS Number: " + encap.getNhsNumber());
		
		System.out.println(encap.toString());
	}

}
