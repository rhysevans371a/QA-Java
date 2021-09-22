package Encapsulate;

//1) Create a new class call Encapsulation with 5 variables (one String, one integer, one double, one float and one long).
//2) Encapsulate your variables (make them private and generate getters and setters).
//3) Generate two constructors - one should be empty.
//4) Use setters to set values in your Runner.java.
//5) Use getters and System.out.println(); to print out the values in your Runner.java.
//6) Generate toString in your Encapsulation.java and invoke it from Runner.java.
public class Encapsulation {

	private String name;
	private int age;
	private double weight;
	private float height;
	private long nhsNumber;

	public Encapsulation() {

	}

	public Encapsulation(String name, int age, double weight, float height, long nhsNumber) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.nhsNumber = nhsNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public long getNhsNumber() {
		return nhsNumber;
	}

	public void setNhsNumber(long nhsNumber) {
		this.nhsNumber = nhsNumber;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", nhsNumber=" + nhsNumber + "]";
	}

}
