package com.rp.write.complex.pojo.to.xml;


public class Student {
	
	private String id;
	private String mobilenumber;
	private String name;
	private String course;
	
	public Student() {
	}

	public Student(String id, String name, String mobile, String course) {
		this.id = id;
		this.name = name;
		this.mobilenumber = mobile;
		this.course = course;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
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
	public void setCourse(String course) {
		this.course = course;
	}
}

