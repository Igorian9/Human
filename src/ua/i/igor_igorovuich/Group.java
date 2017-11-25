package ua.i.igor_igorovuich;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private Student[] group = new Student[10];

	public Group() {
		super();
	}

	public void addStudentToGroup(Student studInfo) throws FullGroupException {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = studInfo;
				return;
			}
		}
		throw new FullGroupException();

	}

	public void deleteStudentFromGroup(int number) {
		try {
			if (number - 1 < group.length && group[number - 1] != null) {
				group[number - 1] = null;
			} else {
				System.err.println("Student not found!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error no index: " + e.getMessage());
		}

	}

	public Student findStudent(String surname) {
		try {
			for (int i = 0; i < group.length; i++) {
				if (group[i].getSurname() != null && surname != null && surname.equals(group[i].getSurname())) {
					return group[i];
				}
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public void sortBySurname() {
		Arrays.sort(group, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if (o1 == null || o2 == null) {
					return 0;
				} else if (o1.getSurname() == null || o2.getSurname() == null) {
					return 1;
				}
				return o1.getSurname().compareTo(o2.getSurname());
			}
		});
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				sb.append(group[i].toString() + System.lineSeparator());
			}
		}
		return "Group: " + sb.toString();
	}

}
