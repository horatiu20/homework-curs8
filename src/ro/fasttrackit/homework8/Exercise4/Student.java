package ro.fasttrackit.homework8.Exercise4;

public class Student {
	private final String name;
	private final int grade;
	static double sumGrades = 261;
	static double allStudents = 30;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	String getName() {
		return name;
	}

	int getGrade() {
		return grade;
	}

	public static double averageGrade() {
		return sumGrades / allStudents;
	}
}
