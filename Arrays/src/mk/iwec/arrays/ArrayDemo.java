package mk.iwec.arrays;

import java.util.Random;

public class ArrayDemo {
	private int [] a;
	
	public ArrayDemo(int n) {
		a = new int [n];
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10);	
	}
}
	public int [] getEvenOdd() {
		int [] result = new int[2];
		for (int el : a) {
			if (el % 2 == 0 ) {
				result[0] =+ el;
			} else {
				result[1]+= el;
			}
		}
	return result;
}

		
	}
