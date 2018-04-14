package com.glarimy.struts.directory.api;

public class Employee {
	private Name name;
	private long phoneNumber;

	public Employee() {

	}

	public Employee(Name name, long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
