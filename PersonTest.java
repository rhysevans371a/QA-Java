package Persons;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
	public static List<Person> People = new ArrayList<Person>();
	
	public static void main(String[] args) {
		
		Person bob = new Person (175, 14, 21, "Bob", "Student");
		Person rhys = new Person(170,"Rhys");
		Person gerald = new Person(150, 10, 40, "Gerald", "Manager");
		Person hiru = new Person(165, 14, 30, "Hiru", "Student");
		Farmer giles = new Farmer();
		Banker peter = new Banker();
		Object paul = new Farmer();
		Person simon = new Farmer();
		((Person) paul).setName("Paul");
		((Farmer) paul).greet();
		peter.setName("Peter");
		peter.setBankLocation("London");
		peter.setEmployeeNo(123456);
		giles.setName("Giles");
		giles.setFarmType("Dairy");
		giles.setFarmLocation("Surrey");
		giles.farmType();
		giles.greet();
		giles.farmLocation();
		peter.greet();
		People.add(bob);
		People.add(rhys);
		People.add(gerald);
		People.add(hiru);
		People.add(giles);
		People.add(peter);
		People.add((Person)paul);
		People.add(simon);
		People.stream()
        .forEach(x -> System.out.println(x));

//
//		System.out.println(giles.toString());
//		System.out.println(peter.toString());
//		rhys.greet();
//		gerald.greet();
//		gerald.feetSize();
//		bob.feetSize();
//		hiru.greet();
//		hiru.feetSize();
		rhys.greet();
		gerald.greet();
		gerald.feetSize();
		bob.feetSize();
		hiru.greet();
		hiru.feetSize();
	}

}
