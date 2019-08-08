/**
 *  :: Requirement ::
 *  
 *  Let's assume we have a Hashtable which have some set of objects where a class object is treated as key(here we have Employee)
 *  and a integer/int is stored as a value.
 *  Now if someone will insert duplicate key(look into duplicate section) then we have to update the update it's corresponding 
 *  value by 1.
 *  
 *  :: Duplicate ::
 *  
 *  A duplicate object is a combination of properties(in this scenario first name & last name ) available in the object stored as key.
 *  
 */
package com.rp.search.and.update.value.in.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 * @author Vivek
 */
public class UpdateValueBasedOnKeyProperty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee[] employeeList = {new Employee("Amit","Kumar"),
				new Employee("Aman","Kumar"),
				new Employee("Karan","Kumar"),
				new Employee("Bablu","Kumar"),
				new Employee("Pintu","Kumar")
		};
		
		Hashtable<Employee, Integer> table = new Hashtable<Employee, Integer>();
		
		int key = 0;
		for(Employee employee : employeeList) {
			table.put(employee, key++);
		}
		System.out.println("Table : " + table + "\nEmpty status : "+ table.isEmpty());
		
		Employee duplicateEmployee = new Employee("Pintu","Kumar");
		
		/**
		 * Getting key and value sets
		 */
		Enumeration<Employee> keySet = table.keys();

		while(keySet.hasMoreElements()) {
			Employee emp = keySet.nextElement();
			boolean isDuplicate = duplicateEmployee.equals(emp);
			if(isDuplicate) {
				//getting associated value with the duplicate object
				int duplicateObjectKey = (int)table.get(emp);
				table.put(emp, duplicateObjectKey+100);
			}
			System.out.println("Is duplicate " + isDuplicate);
		}
		
		
		System.out.println("Table : " + table + "\nEmpty status : "+ table.isEmpty());

	}
}
