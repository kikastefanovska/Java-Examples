package mk.iwec.comparable;

public class Student implements Comparable<Student> {

	private String firstName;
	private String lastName;
	
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
	
	@Override
	public int compareTo(Student that) {
		int byLastName = this.lastName.compareTo(that.lastName);
		int byFirstName = this.firstName.compareTo(that.firstName);
		return byLastName !=0 ? byLastName : byFirstName;  		
	}

}
