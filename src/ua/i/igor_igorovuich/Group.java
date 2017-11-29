package ua.i.igor_igorovuich;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group implements Commissar {
	private Student[] group = new Student[10];

	public Group() {
		super();
	}

	public void addStudentToGroup(Student studInfo) throws FullGroupException {
		if (studInfo != null) {
			for (int i = 0; i < group.length; i++) {
				if (group[i] == null) {
					group[i] = studInfo;
					return;
				}
			}
			throw new FullGroupException();

		} else {
			System.err.println("Error! Information about student can't be empty");
		}
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
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getSurname().compareTo(b.getSurname()));
	}

	public void sortByName() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getName().compareTo(b.getName()));
	}

	public void sortByAge() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: a.getAge() - b.getAge());
	}

	public void sortByHeight() {
		Arrays.sort(group, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
				: (int) a.getHeight() - (int) b.getHeight());
	}

	public int addAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student age");
		int age = sc.nextInt();
		while (age < 0 || age > 150) {
			System.out.println("Error! Enter student age again!");
			age = sc.nextInt();
		}
		return age;
	}

	public double addHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student height");
		double height = sc.nextDouble();
		while (height < 50 || height > 300) {
			System.out.println("Error! Enter student height again!");
			height = sc.nextDouble();
		}
		return height;
	}

	public double addWeight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student weight");
		double weight = sc.nextDouble();
		while (weight < 30 || weight > 400) {
			System.out.println("Error! Enter student weight again!");
			weight = sc.nextDouble();
		}
		return weight;
	}

	public String addSurname() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student surname");
		String surname = sc.nextLine();
		while (surname == null) {
			System.out.println("Error! Enter student surname again!");
			surname = sc.nextLine();
		}
		return surname;
	}

	public String addName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		while (name == null) {
			System.out.println("Error! Enter student name again!");
			name = sc.nextLine();
		}
		return name;
	}

	public String addNationality() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student nationality");
		String nationality = sc.nextLine();
		while (nationality == null) {
			System.out.println("Error! Enter student nationality again!");
			nationality = sc.nextLine();
		}
		return nationality;
	}

	public boolean addSex() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student sex (male or female)");
		String s = sc.nextLine();
		if (s.equals("Male") || s.equals("male") || s.equals("true")) {
			return true;
		} else if (s.equals("Female") || s.equals("female") || s.equals("false")) {
			return false;
		} else {
			System.out.println("Error! The student gender is set to the standart value. ");
			s = sc.nextLine();
			return false;
		}

	}

	public int addCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student course");
		int course = sc.nextInt();
		while (course < 0 || course > 6) {
			System.out.println("Error! Enter student age again!");
			course = sc.nextInt();
		}
		return course;
	}

	public String addFaculty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student faculty");
		String faculty = sc.nextLine();
		while (faculty == null) {
			System.out.println("Error! Enter student faculty again!");
			faculty = sc.nextLine();
		}
		return faculty;
	}

	public String addInstitute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student institute");
		String institute = sc.nextLine();
		while (institute == null) {
			System.out.println("Error! Enter student institute again!");
			institute = sc.nextLine();
		}
		return institute;
	}

	public void addStudentFromKeyboard() {
		Student student = new Student(addAge(), addHeight(), addWeight(), addSurname(), addName(), addNationality(),
				addSex(), addCourse(), addFaculty(), addInstitute());
		try {
			addStudentToGroup(student);
		} catch (FullGroupException e) {
			e.getMessage();
		}
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

	@Override
	public Student[] isDraft() {
		Student[] studentArray = new Student[group.length];
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getAge() > 18) {
				studentArray[i] = group[i];
				System.out.println(studentArray[i]);
			}
		}
		return studentArray;
	}

}
