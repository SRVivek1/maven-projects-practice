package com.rp.write.complex.pojo.to.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentList {

	List<Student> students = new ArrayList<Student>();

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		if(null == students){
			students = new ArrayList<Student>();
		}
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
		
}
