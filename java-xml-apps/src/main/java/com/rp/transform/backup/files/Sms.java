package com.rp.transform.backup.files;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sms {

	private String address;
	private String date;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	@XmlAttribute(name = "address")
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	@XmlAttribute(name = "date")
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[" + address + ", " + date + "]";
	}
}
