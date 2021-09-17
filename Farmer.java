package Persons;

public class Farmer extends Person {

	private String farmLocation;
	private String farmType;

	public Farmer(double height, double shoesize, int age, String name, String jobTitle) {
		super(height, shoesize, age, name, jobTitle);
		// TODO Auto-generated constructor stub
	}

	public Farmer () {
		
	}

	public Farmer(double height, double shoesize, int age, String name, String jobTitle, String farmLocation,
			String farmType) {
		super(height, shoesize, age, name, jobTitle);
		this.farmLocation = farmLocation;
		this.farmType = farmType;
	}

	public String getFarmLocation() {
		return farmLocation;
	}

	public void setFarmLocation(String farmLocation) {
		this.farmLocation = farmLocation;
	}

	public String getFarmType() {
		return farmType;
	}

	public void setFarmType(String farmType) {
		this.farmType = farmType;
	}

	public void farmType() {
		System.out.println(name + "'s farm is a " + farmType + " farm");
	}
	public void farmLocation() {
		System.out.println(name + "'s farm is located in " + farmLocation);
	}
	@Override
	public void greet() {
		System.out.println("Hi " + name + " your farm is a " + farmType + " farm and it is located in " + farmLocation);
	}

	@Override
	public String toString() {
		return "Farmer [farmLocation=" + farmLocation + ", farmType=" + farmType + ", name=" + name + "]";
	}
	
}
