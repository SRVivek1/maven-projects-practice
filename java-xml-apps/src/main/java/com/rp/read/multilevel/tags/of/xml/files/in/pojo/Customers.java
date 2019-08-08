package com.rp.read.multilevel.tags.of.xml.files.in.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {

	@XmlElement(name = "customer")
	private List<Customer> customers = new ArrayList<Customer>();
	
	Object lock = new Object();

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		synchronized (lock) {
			if (null == customers) {
				customers = new ArrayList<Customer>();
			}
		}
		return customers;
	}
	
	@Override
	public String toString() {
		StringBuffer data = new StringBuffer();
		
		data.append("[");
		for(Customer customer : customers){
			data.append(customer.toString());
			data.append(", ");
		}
		data.append("]");
		return data.toString();
	}
}
