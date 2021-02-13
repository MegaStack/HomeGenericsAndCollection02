package com.gmail.oastro36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Group<S> implements Voenkom {
	private ArrayList<Student> groupStudents = new ArrayList<Student>();
	private String groupName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public ArrayList<Student> getGroupStudents() {
		return groupStudents;
	}

	public Optional<Student> findStudentByLastNameOptional(String lastName) {
		Student foundStudent = null;
		for (int i = 0; i < groupStudents.size(); i++) {
			if ((((groupStudents.get(i)).getLastName())).equals(lastName)) {
				foundStudent = groupStudents.get(i);
				break;
			}
		}
		return Optional.ofNullable(foundStudent);
	}

	public void addStudent(Student student) throws EleventhStudentExeption {
		if (groupStudents.size() != 10) {
			groupStudents.add(student);
			return;
		}
		throw new EleventhStudentExeption();
	}

	public boolean delStudent(int zach) {
		boolean resultDel = false;
		for (int i = 0; i < groupStudents.size(); i++) {
			if (((groupStudents.get(i)).getZachNumber()) == zach) {
				groupStudents.remove(i);
				resultDel = true;
			}
		}
		return resultDel;
	}

	public void sortByParameter(int parOne, int parTwo) {
		groupStudents.sort(new ComparatorOfStudents(parOne, parTwo));
	}

	@Override
	public Student[] toArmy() {
		int count = 0;
		for (int i = 0; i < groupStudents.size(); i++) {
			if ((groupStudents.get(i)).isSex() && (groupStudents.get(i)).getAge() >= 18) {
				count += 1;
			}
		}

		Student[] arrayToArmy = new Student[count];
		int flag = 0;
		for (int i = 0; i < groupStudents.size(); i++) {
			if ((groupStudents.get(i)).isSex() && (groupStudents.get(i)).getAge() >= 18) {
				arrayToArmy[flag] = groupStudents.get(i);
				flag += 1;
			}
		}
		return arrayToArmy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Group: " + this.groupName + System.lineSeparator());
		for (int i = 0; i < groupStudents.size(); i++) {
			sb.append(i + 1 + ") ");
			sb.append(groupStudents.get(i).toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}