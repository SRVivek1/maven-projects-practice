package com.rp.write.complex.pojo.to.xml;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ComplexPojoToXmlApp {

	private StudentList students = null;

	public ComplexPojoToXmlApp() {
		students = new StudentList();
	}

	public static void main(String[] args) {
		ComplexPojoToXmlApp application = new ComplexPojoToXmlApp();
		application.populateData();
		application.convertToXml();
	}

	/**
	 * Populate the data
	 */
	private void populateData() {
		List<Student> studentList = this.students.getStudents();
		Student student1 = new Student("1001", "raju", "8993593130", "mba");
		Student student2 = new Student("1002", "rajiv", "8993593135", "bba");

		studentList.add(student1);
		studentList.add(student2);
	}

	public void convertToXml() {
		JAXBContext jbContext = null;
		try {
			jbContext = JAXBContext.newInstance(StudentList.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Marshaller marshaller = null;
		try {
			marshaller = jbContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		try {
			marshaller.marshal(StudentList.class, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		System.out.println(this.students.getStudents());

	}
}
