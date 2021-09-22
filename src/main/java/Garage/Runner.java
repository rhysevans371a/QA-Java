package Garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		Car newCar = new Car(1, "regNo", "Ford", "Escort", 120, 2017, 5000, "Car", true, true);
		Motorbike bike = new Motorbike(2, "regNumber", "Yamaha", "noidea", 120, 2017, 5000, "Motorbike", 2000);
		Car car1 = new Car();
		Van van1 = new Van(3, "registrationNo", "Toyota", "model1", 200, 2019, 6000, "Van", true, true);
		garage.addVehicle(newCar);
		garage.addVehicle(bike);
		garage.addVehicle(car1);
		garage.addVehicle(van1);
		garage.calculateBills();
		garage.removeID(1);
		garage.removeAllByType("Car");
		//garage.emptyGarage();
		garage.printAll();
}
}