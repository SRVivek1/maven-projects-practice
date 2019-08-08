/**
 * 
 */
package com.rp.search.and.update.value.in.hashtable;

/**
 * @author Vivek
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee() {}
	
	public Employee(String fName, String lName) {
		this.firstName = fName;
		this.lastName =  lName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;		
		return this.getFirstName().concat(this.getLastName()).equalsIgnoreCase(emp.getFirstName().concat(emp.getLastName()));
	}
}
