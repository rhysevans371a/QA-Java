package Persons;

public class Banker extends Person {
	
	private int employeeNo;
	private String bankLocation;
	
	public Banker(double height, double shoesize, int age, String name, String jobTitle) {
		super(height, shoesize, age, name, jobTitle);
		// TODO Auto-generated constructor stub
	}
	public Banker() {
		
	}
	public Banker(double height, double shoesize, int age, String name, String jobTitle, int employeeNo,
			String bankLocation) {
		super(height, shoesize, age, name, jobTitle);
		this.employeeNo = employeeNo;
		this.bankLocation = bankLocation;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public void bankLocation() {
		System.out.println(name + "'s farm is located in " + bankLocation);
	}
	@Override
	public void greet() {
		System.out.println("Hi " + name + " your employee number is " + employeeNo + " and you work in " + bankLocation);
	}
	@Override
	public String toString() {
		return "Banker [employeeNo=" + employeeNo + ", bankLocation=" + bankLocation + ", name=" + name + "]";
	}
	
	

}
