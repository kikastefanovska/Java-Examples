package finalExam.task2;

public class Student {
	private int student_id;
	private String first_name;
	private String last_name;
	private Gender gender;
	private double grade;

	public Student(int student_id, String first_name, String last_name, Gender gender, double grade) {
		super();
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.grade = grade;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", grade=" + grade + "]";
	}
}
	


