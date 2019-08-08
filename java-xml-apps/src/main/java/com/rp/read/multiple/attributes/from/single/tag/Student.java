package com.rp.read.multiple.attributes.from.single.tag;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private String id;
	private String name;
	private String course;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	@XmlAttribute
	public void setCourse(String course) {
		this.course = course;
	}
}
