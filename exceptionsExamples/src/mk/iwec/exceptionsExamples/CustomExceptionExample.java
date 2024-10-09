package mk.iwec.exceptionsExamples;

public class CustomExceptionExample {

	public static void validate(int age) throws InvalidAgeException {
		if (age < 17) {
			throw new  InvalidAgeException("Person is not eligible to drive a car");
		} else {
			System.out.println("Person is eligible to drive a car");
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			validate(10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
