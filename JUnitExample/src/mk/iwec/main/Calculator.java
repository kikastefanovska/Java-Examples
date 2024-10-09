package mk.iwec.main;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
}
	public float divide(int x,int y) {
		if (y==0) {
			throw new ArithmeticException("Division by zero");
		}
		
		return (float) x/y;
	}
}
