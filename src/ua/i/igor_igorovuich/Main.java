package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Group group = new Group();

		group.addStudentFromKeyboard();

		Student studentOne = new Student(19, 180, 72.3, "Fake", "Alex", "european", true, 2, "Faculty of Mathematics",
				"Harvard University");
		Student studentTwo = new Student(20, 160, 45, "Apolo", "Annet", "european", false, 4, "Faculty of Chemistry",
				"Harvard University");
		Student studentThree = new Student(21, 172.5, 65, "Black", "John", "european", true, 5, "Faculty of Chemistry",
				"Harvard University");
		Student studentFour = new Student(18, 192.5, 85, "Undo", "Fred", "european", true, 2, "Faculty of Mathematics",
				"Harvard University");
		try {
			group.addStudentToGroup(studentOne);
			group.addStudentToGroup(studentTwo);
			group.addStudentToGroup(studentThree);
			group.addStudentToGroup(studentFour);
		} catch (FullGroupException e) {
			e.getMessage();
		}

		getGroupInfo(group);
		int flag = checkFlag();
		sort(flag, group);
		getGroupInfo(group);
	}

	@SuppressWarnings("resource")
	public static int checkFlag() {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("Which parametr do you want to sort?");
		System.out.println("(1 - Surname, 2 - Name, 3 - Height, 4 - Age)");
		flag = sc.nextInt();
		return flag;
	}

	public static void sort(int flag, Group group) {
		if (flag == 1) {
			group.sortBySurname();
		} else if (flag == 2) {
			group.sortByName();
		} else if (flag == 3) {
			group.sortByHeight();
		} else if (flag == 4) {
			group.sortByAge();
		}

	}

	public static void getGroupInfo(Group group) {
		System.out.println(group.toString());
		System.out.println();
	}

	public static void getArmy(Group group) {
		System.out.println("Hello army!");
		group.isDraft();
		System.out.println();
	}
}