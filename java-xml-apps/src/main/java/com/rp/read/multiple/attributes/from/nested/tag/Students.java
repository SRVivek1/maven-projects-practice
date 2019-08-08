package com.rp.read.multiple.attributes.from.nested.tag;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "students")
public class Students {

	private List<Student> students = null;

	public Students() {
		students = new ArrayList<Student>();
	}
	/**
	 * @return the students
	 */
	@XmlElementWrapper(name = "students")
	@XmlElement
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	@XmlElement
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
