package ro.fasttrackit.homework8.Exercise4;

/* Create an object that represents a Student with name and grade.
Add getters for them. No setters, the object is immutable.
Create two static fields that will remember the sum of the grades and the other is the number of students.
Also create a static method that uses these static fields to calculate the average grade for all students.*/

public class Main {
	public static void main(String[] args) {
		Student myStudent = new Student("Horatiu", 8);
		System.out.println("Name: " + myStudent.getName());
		System.out.println("Grade: " + myStudent.getGrade());

		System.out.println("Average classroom grades is: " + myStudent.averageGrade());
	}
}
