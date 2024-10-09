package mk.iwec.bubbleSortExample;

import java.util.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
	
		int[] array = { 2,9,3,55,6,5,88,66};
		bubbleSort(array);
		
		System.out.println(Arrays.toString(array));
		
		
	}

	
	private static void bubbleSort(int[] array) {
		int size = array.length;
		for (int i=0; i <size - 1; i++) {
			boolean swapped = false;
			for (int j=0; j < size - 1-i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array [j+1]= temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
		
	}

}
