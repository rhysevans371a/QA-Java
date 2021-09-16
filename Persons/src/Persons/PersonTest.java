package Persons;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Person (175, 14, 21, "Bob", "Student");
		Person rhys = new Person(170,"Rhys");
		Person gerald = new Person(150, 10, 40, "Gerald", "Manager");
		Person hiru = new Person(165, 14, 30, "Hiru", "Student");
		rhys.greet();
		gerald.greet();
		gerald.feetSize();
		bob.feetSize();
		hiru.greet();
		hiru.feetSize();
	}

}
