package Persons;

public class Person {
	private double height, shoesize;
	private int age;
	private String name, jobTitle;

	public Person(double height, double shoesize, int age, String name, String jobTitle) {
		this.height = height;
		this.shoesize = shoesize;
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public Person(double height, String name) {
		this.height = height;
		this.name = name;
	}

	public void greet() {
		System.out.println("Welcome " + name);
	}
	
	public void feetSize() {
		if (shoesize> 12) {
			System.out.println("Your feet are far to big you freak");
		}
		else {
			System.out.println("your feet are normal, Good job!");
		}
	}
	
}