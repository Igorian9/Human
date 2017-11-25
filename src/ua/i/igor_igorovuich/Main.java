package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		Student studentOne = new Student(19, 180, 72.3, "Fake", "Alex", "european", true, 2, "Faculty of Mathematics",
				"Harvard University");
		Student studentTwo = new Student(20, 160, 45, "Unk", "Annet", "european", false, 4, "Faculty of Chemistry",
				"Harvard University");
		Student studentThree = new Student(21, 172.5, 65, "May", "John", "european", true, 5, "Faculty of Chemistry",
				"Harvard University");
		Student studentFour = new Student(18, 192.5, 85, "Oled", "Fred", "european", true, 2, "Faculty of Mathematics",
				"Harvard University");

		Group group = new Group();
		try {
			group.addStudentToGroup(studentOne);
			group.addStudentToGroup(studentTwo);
			group.addStudentToGroup(studentThree);
			group.addStudentToGroup(studentFour);
		} catch (FullGroupException e) {
			e.getMessage();
		}

		System.out.println(group);
		System.out.println();

		System.err.println("I sorted a group!");
		group.sortBySurname();
		System.out.println(group);
		System.out.println();

		System.err.println("I found a student!");
		System.out.println();
		System.out.println(group.findStudent("May"));
		System.out.println();

		group.deleteStudentFromGroup(0);
		System.out.println();

		group.deleteStudentFromGroup(1);
		System.err.println("I deleted a student!");
		System.out.println();
		System.out.println(group);

	}

}
