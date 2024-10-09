package mk.iwec.arrays;

import java.util.Random;

public class App {

	public static void main(String[] args) {

		// int[] a = {10,35,2,6,8};
		// System.out.println (a[0]);
		// a[0]=5;
		// System.out.println(a[0]);
		int[] a = new int[5];
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10);
		//ystem.out.println(a[i]);

			ArrayDemo ad = new ArrayDemo(10);
			
			int [] result= ad.getEvenOdd();
			System.out.println("even " + result[0]);
			System.out.println("odd"+result[1]);
			
	
}
}
}