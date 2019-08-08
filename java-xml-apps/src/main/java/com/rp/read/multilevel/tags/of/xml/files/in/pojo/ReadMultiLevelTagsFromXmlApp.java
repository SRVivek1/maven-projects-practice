package com.rp.read.multilevel.tags.of.xml.files.in.pojo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadMultiLevelTagsFromXmlApp {

	public static void main(String[] args) {
		final String fileToParse = "bin/com/rp/read/multilevel/tags/of/xml/files/in/pojo/cusromers.xml";
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Customers.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Unmarshaller jaxbUnmarshaller = null;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Customers customerList = null;
		try {
			customerList = (Customers) jaxbUnmarshaller.unmarshal(new File(
					fileToParse));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		System.out.println(customerList.toString());
	}
}
