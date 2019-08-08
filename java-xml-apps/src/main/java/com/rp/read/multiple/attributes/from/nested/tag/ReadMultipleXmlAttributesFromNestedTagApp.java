package com.rp.read.multiple.attributes.from.nested.tag;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadMultipleXmlAttributesFromNestedTagApp {

	public static void main(String[] args) {

		final String xmlDataFile = "bin/com/rp/read/multiple/attributes/from/nested/tag/student-info.xml";

		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Students.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Unmarshaller unmarshaller = null;
		try {
			unmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Students students = null;
		try {
			students = (Students) unmarshaller.unmarshal(new File(xmlDataFile));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		List<Student> studentList = students.getStudents();
		for(Student student:studentList){
			System.out.println(student.getId() + ", " + student.getName() + ", "
					+ student.getCourse());
		}
		System.out.println(studentList);
	}
}
