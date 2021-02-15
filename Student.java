package com.gmail.oastro36;

public class Student extends Human{
	private String groupName;
	private int zachNumber;

	public Student(String name, String lastName, String sureName, int age, boolean sex, String groupName, int zachNumber) {
		super(name, lastName, sureName, age, sex);
		this.groupName = groupName;
		this.zachNumber = zachNumber;
	}

	public Student() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getZachNumber() {
		return zachNumber;
	}

	public void setZachNumber(int zachNumber) {
		this.zachNumber = zachNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + zachNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (zachNumber != other.zachNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " group name: " + groupName + ", id: " + zachNumber;
	}	
}