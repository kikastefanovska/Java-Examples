package finalExam.task1;

public class ThreeDigitNumbers {

	public static void main(String[] args) {
		for (int number = 200; number <= 230; number++) {

			if (number >= 100 && number <= 999 && number % 2 == 0) {

				if (number == 210) {
					continue;
				}
				System.out.println(number);

			}

		}
	}
}
