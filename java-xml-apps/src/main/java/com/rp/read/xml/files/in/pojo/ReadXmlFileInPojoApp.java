package com.rp.read.xml.files.in.pojo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXmlFileInPojoApp {

	public static void main(String[] args) {

		final String fileToParse = "bin/com/rp/read/xml/files/in/pojo/cusromer.xml";
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Customer.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Unmarshaller jaxbUnmarshaller = null;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Customer customer = null;
		try {
			customer = (Customer) jaxbUnmarshaller.unmarshal(new File(
					fileToParse));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println(customer.toString());
	}

}
