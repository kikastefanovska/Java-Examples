package finalExam.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRecordSystem {

	private List<Student> studentsList;

	public StudentRecordSystem() {
		studentsList = new ArrayList<>();
	}

//1Add new student
	public void addStudent(Student student) {
		studentsList.add(student);
	}

//2 Display the list of all students in descending order by grade (from students with the highest grade to those with the lowest grade).
	public void StudentsByDescendingGrade() {
		// Sort the studentsList using a custom comparator
		Collections.sort(studentsList, Comparator.comparingDouble(Student::getGrade).reversed());

		// Display the sorted list
		for (Student student : studentsList) {
			System.out.println(student);
		}
	}

//3Find and display students with a grade higher than a given value.
	public void StudentsWithGradeGreaterThan(double value) {
		System.out.println("Students with grade greater than " + value + ":");
		for (Student student : studentsList) {
			if (student.getGrade() > value) {
				System.out.println(student);
			}
		}
	}

//4Remove a student from the studentsList based on their student_id.
	public void removeStudentById(int studentId) {
		for (Student student : studentsList) {
			if (student.getStudent_id() == studentId) {
				studentsList.remove(student);
				return;
			}
		}
		System.out.println("Student with id " + studentId + " not found.");
	}
}