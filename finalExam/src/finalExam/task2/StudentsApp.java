package finalExam.task2;

public class StudentsApp {

	public static void main(String[] args) {
		StudentRecordSystem recordsystem = new StudentRecordSystem();

	
	 recordsystem.addStudent(new Student(1, "Hristina", "Stefanovska", Gender.FEMALE, 90.0));
     recordsystem.addStudent(new Student(2, "Elena", "Stefanovska", Gender.FEMALE, 83.5));
     recordsystem.addStudent(new Student(3, "Pavlina", "Pavlovic", Gender.FEMALE, 92.5));
     recordsystem.addStudent(new Student(4, "Petar", "Pavlov", Gender.MALE, 90.5));
     recordsystem.addStudent(new Student(5, "Milos", "Milosevic", Gender.MALE, 75.5));
     recordsystem.addStudent(new Student(6, "Petar", "Petrov", Gender.MALE, 70.5));

     System.out.println("Students sorted by descending grade:");
     recordsystem.StudentsByDescendingGrade();
     
     recordsystem.StudentsWithGradeGreaterThan(90.0);
     recordsystem.removeStudentById(3);
     
     System.out.println("Students after making remove:");
     recordsystem.StudentsByDescendingGrade();
}
}
