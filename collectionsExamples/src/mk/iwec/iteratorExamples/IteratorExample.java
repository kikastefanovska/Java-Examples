package mk.iwec.iteratorExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(5);
		lista.add(22);
		
		System.out.println(lista);
		
		int biggestNumber = 0;
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i > biggestNumber) {
				biggestNumber = i ;
		}
		System.out.println(i);
	}
		System.out.println("The biggest Number is " +biggestNumber);
}
}
