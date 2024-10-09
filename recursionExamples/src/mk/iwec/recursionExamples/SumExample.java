package mk.iwec.recursionExamples;

public class SumExample {
	private static int count;

	// sum using for loop
	public static int sumFor(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			// System.out.println(i);
		}
		return sum;
	}

	// sum using recursion

	public static int sumRecursion(int n) {
		if (n >= 1) {
			return sumRecursion(n - 1) + n;
		}
		return n;
	}

	// sum using tail recursion
	public static int sumTailRecursion(int currentSum, int n) {
		if (n <= 1) {
			return currentSum + n;
		}
		return sumTailRecursion(currentSum + n, n - 1);
	}

	private static void recursion() {
		count++;
		if (count <= 5) {
			System.out.println("Hello " + count);
			recursion();
		}
	}

	public static void main(String[] args) {

		// System.out.println(sumFor(5));
		// recursion();
		System.out.println("Head recursion " + sumRecursion(5));
		System.out.println("Tail recursion " + sumTailRecursion(0, 5));
	}

}
