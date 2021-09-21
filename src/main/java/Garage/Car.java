package Garage;

public class Car extends Vehicle {
	private boolean sunRoof;
	private boolean convertible;

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [sunRoof=" + sunRoof + ", convertible=" + convertible + "]";
	}

	public Car(int ID, String registrationNo, String make, String model, int topSpeed, int year, double price,
			String type, boolean sunRoof, boolean convertible) {
		super(ID, registrationNo, make, model, topSpeed, year, price, type);
		// TODO Auto-generated constructor stub
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}

	@Override
	public double fixVehicle(double cost) {
		// TODO Auto-generated method stub
		super.fixVehicle(cost);
		return cost + 500.00;

	}

}
