package Garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void calculateBills() {
		double carCost = 0;
		double vanCost = 0;
		double bikeCost = 0;
		int count = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == "Car") {
				carCost = vehicle.fixVehicle(carCost);
			} else if (vehicle.getType() == "Van") {
				vanCost = vehicle.fixVehicle(vanCost);
			} else if (vehicle.getType() == "Motorbike") {
				bikeCost = vehicle.fixVehicle(bikeCost);
			} else {
				count++;
			}

		}
		System.out.println("Car costs: " + carCost);
		System.out.println("Van cost: " + vanCost);
		System.out.println("Bike costs: " + bikeCost);
		System.out.println(count + " vehicles had no type selected");
	}

	public void removeID(int ID) {
		Vehicle item = null;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getID() == ID) {
				item = vehicle;
			} 
		}
		System.out.println("Vehicle ID " + ID + " has been removed");
		vehicles.remove(item);
	}

	public void removeAllByType(String type) {
		ArrayList<Vehicle> remove = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == type) {
				remove.add(vehicle);
			}
		}
		for (Vehicle removed : remove) {
			vehicles.remove(removed);
		}
	}

	public void emptyGarage() {
		vehicles.removeAll(vehicles);
	}

	public void printAll() {
		vehicles.forEach(System.out::println);
	}

}
