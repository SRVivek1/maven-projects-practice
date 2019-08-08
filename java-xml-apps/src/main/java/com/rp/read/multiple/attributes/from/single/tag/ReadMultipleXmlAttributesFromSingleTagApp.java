package com.rp.read.multiple.attributes.from.single.tag;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadMultipleXmlAttributesFromSingleTagApp {

	public static void main(String[] args) {

		final String xmlDataFile = "bin/com/rp/read/multiple/attributes/from/single/tag/student-info.xml";

		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Student.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Unmarshaller unmarshaller = null;
		try {
			unmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Student student = null;
		try {
			student = (Student) unmarshaller.unmarshal(new File(xmlDataFile));
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		System.out.println(student.getId() + ", " + student.getName() + ", "
				+ student.getCourse());
	}

}
