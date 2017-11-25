package ua.i.igor_igorovuich;

public class Student extends Human {
	private int course;
	private String faculty;
	private String institute;

	public Student(int age, double height, double weight, String name, String surname, String nationality, boolean sex,
			int course, String faculty, String institute) {
		super(age, height, weight, name, surname, nationality, sex);
		this.course = course;
		this.faculty = faculty;
		this.institute = institute;
	}

	public Student(int age, double height, double weight, String name, String surname, String nationality,
			boolean sex) {
		super(age, height, weight, name, surname, nationality, sex);
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	@Override
	public String toString() {
		return super.toString() + ", course = " + course + ", faculty = " + faculty + ", institute = " + institute + "]"
				+ System.lineSeparator();
	}

}
