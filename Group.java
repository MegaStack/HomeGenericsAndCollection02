package com.gmail.oastro36;

import java.util.ArrayList;
import java.util.Optional;

public class Group implements Voenkom {
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
		for (Student student : groupStudents) {
			if (((student.getLastName())).equals(lastName)) {
				foundStudent = student;
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
		for (Student student : groupStudents) {
			if ((student.getZachNumber()) == zach) {
				groupStudents.remove(student);
				resultDel = true;
			}
		}
		return resultDel;
	}

	public void sortByParameter(int parOne, int parTwo) {
		groupStudents.sort(new ComparatorOfStudents(parOne, parTwo));
	}

	@Override
	public ArrayList<Student> toArmy() {
		ArrayList<Student> studentsToArmy = new ArrayList<Student>();	

		for (Student student : groupStudents) {
			if(student.isSex() && (student.getAge() >= 18)) {
				studentsToArmy.add(student);
			}
		}
		
		return studentsToArmy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Group: " + this.groupName + System.lineSeparator());
		int index = 0;
		for (Student student : groupStudents) {
			sb.append(index + 1 + ") ");
			sb.append(student.toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
}