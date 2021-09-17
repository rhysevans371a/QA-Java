package Persons;

public class Person {
	private double height, shoesize;
	private int age;

	protected String name;
	private String jobTitle;

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

	public Person() {
		
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


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getShoesize() {
		return shoesize;
	}

	public void setShoesize(double shoesize) {
		this.shoesize = shoesize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	

	
}