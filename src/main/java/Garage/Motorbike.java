package Garage;

public class Motorbike extends Vehicle {

	private int engineSize;

	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbike(int ID, String registrationNo, String make, String model, int topSpeed, int year, double price,
			String type, int engineSize) {
		super(ID, registrationNo, make, model, topSpeed, year, price, type);
		this.engineSize = engineSize;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fixVehicle(double cost) {
		// TODO Auto-generated method stub
		super.fixVehicle(cost);
		return cost + 250.00;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Motorbike [engineSize=" + engineSize + "]";
	}

}
