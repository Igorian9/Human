package ua.i.igor_igorovuich;

public class Human {

	private int age;
	private double height;
	private double weight;
	private String name;
	private String surname;
	private String nationality;
	private boolean sex;

	public Human(int age, double height, double weight, String surname, String name, String nationality, boolean sex) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getnationality() {
		return nationality;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isSex() {
		return sex;
	}

	@Override
	public String toString() {
		return "[surname = " + surname + ", name = " + name + ", age = " + age + ", height = " + height + ", weight = "
				+ weight + ", nationality = " + nationality + ", sex = " + sex;
	}

}
