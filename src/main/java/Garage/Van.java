package Garage;

public class Van extends Vehicle {

	private boolean refrigeration;
	private boolean electric;

	public boolean isRefrigeration() {
		return refrigeration;
	}

	public void setRefrigeration(boolean refrigeration) {
		this.refrigeration = refrigeration;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public Van() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Van(int ID, String registrationNo, String make, String model, int topSpeed, int year, double price,
			String type, boolean refrigeration, boolean electric) {
		super(ID, registrationNo, make, model, topSpeed, year, price, type);
		this.refrigeration = refrigeration;
		this.electric = electric;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fixVehicle(double cost) {
		// TODO Auto-generated method stub
		super.fixVehicle(cost);
		return cost + 750.00;
	}

	@Override
	public String toString() {
		return "Van [refrigeration=" + refrigeration + ", electric=" + electric + "]";
	}

}
