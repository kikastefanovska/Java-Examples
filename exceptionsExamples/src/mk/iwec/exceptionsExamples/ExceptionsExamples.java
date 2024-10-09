package mk.iwec.exceptionsExamples;

public class ExceptionsExamples {

	public static void main(String[] args) {
		try {
		int data= 50/0;
		}
		catch (ArithmeticException e) {
		e.printStackTrace();
		 }

		// System.out.println("Rest of code");

		String x = "123";
		// System.out.println(Integer.parseInt(x));

		int[] niz = { 1, 2, 3 };
		// System.out.println(niz[10]);

		String y = null;
		// System.out.println(y.length());

		validate(25);
	}

	public static void validate(int age) {
		if (age < 17) {
			throw new ArithmeticException("Person is not eligible to drive a car");
		} else {
			System.out.println("Person is eligible to drive a car");
		}
	}
}
