package com.rp.transform.backup.files;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "smses")
public class Smses {

	private String count;
	private List<Sms> smsList = new ArrayList<Sms>();

	/**
	 * @return the count
	 */
	public String getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	@XmlAttribute
	public void setCount(String count) {
		this.count = count;
	}

	/**
	 * @return the smsList
	 */
	public List<Sms> getSmsList() {
		if (null == smsList) {
			smsList = new ArrayList<Sms>();
		}
		return smsList;
	}

	/**
	 * @param smsList the smsList to set
	 */
	public void setSmsList(List<Sms> smsList) {
		this.smsList = smsList;
	}

	@Override
	public String toString() {
		StringBuffer data = new StringBuffer();
		data.append("[");
		for (Sms sms : smsList){
			data.append(sms.toString()+" ,");
		}
			return data.toString();
	}
}
