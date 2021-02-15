package com.gmail.oastro36;

public class Human {
	private String name;
	private String lastName;
	private String sureName;
	private int age;
	private boolean sex;

	public Human(String name, String lastName, String sureName, int age, boolean sex) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.sureName = sureName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (sex ? 1231 : 1237);
		result = prime * result + ((sureName == null) ? 0 : sureName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		if (sureName == null) {
			if (other.sureName != null)
				return false;
		} else if (!sureName.equals(other.sureName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name: " + name + ", lastname: " + lastName + ", surename: " + sureName + ", age: " + age + ", sex: "
				+ this.isSex() + ",";
	}

}