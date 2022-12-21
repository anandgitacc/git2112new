package org.employee;

public class EmployeeDetails {

	// private -> access specifier of given method
	// void -> return type of given method
	// empName -> method name
	// () -> arguments place / parameter / inputs
	// {} -> block of the given method

	// syntax
	private void empName() {

		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		
		System.out.println("Employee mobile no: 8939278836");
	}
	
	public static void main(String[] args) {
		
		// object syntax
		// Classname  obj/ref         classname
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.empName();
		emp.empMobile();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
