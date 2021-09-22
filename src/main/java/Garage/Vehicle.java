package Garage;

public class Vehicle {

	private int ID;
	private String registrationNo;
	private String make;
	private String model;
	private int topSpeed;
	private int year;
	private double price;
	private String type;

	public Vehicle() {

	}

	public Vehicle(int ID, String registrationNo, String make, String model, int topSpeed, int year, double price,
			String type) {
		super();
		this.setID(ID);
		this.registrationNo = registrationNo;
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.year = year;
		this.price = price;
		this.setType(type);
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", registrationNo=" + registrationNo + ", make=" + make + ", model=" + model
				+ ", topSpeed=" + topSpeed + ", year=" + year + ", price=" + price + ", type=" + type + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double fixVehicle(double cost) {
		return cost;
	}

}
