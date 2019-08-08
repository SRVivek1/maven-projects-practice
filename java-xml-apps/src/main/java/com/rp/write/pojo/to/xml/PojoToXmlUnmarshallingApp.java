package com.rp.write.pojo.to.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class PojoToXmlUnmarshallingApp {

	private Student student = null;

	public PojoToXmlUnmarshallingApp() {
		student = new Student();
	}

	public static void main(String[] args) {
		PojoToXmlUnmarshallingApp application = new PojoToXmlUnmarshallingApp();
		application.populateData();
		application.convertToXml();

	}

	private void populateData() {
		student.setId("1001");
		student.setName("Raju");
		student.setCourse("MBA");
		student.setMobilenumber("8793593130");
	}
	
	private String convertToXml(){
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(Student.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		Marshaller marshaller = null;
		try {
			marshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
        try {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (PropertyException e) {
			e.printStackTrace();
		}
        try {
			marshaller.marshal(student, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "";
	}
}
