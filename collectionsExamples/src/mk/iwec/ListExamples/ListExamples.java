package mk.iwec.ListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ListExamples {

	public static void main(String[] args) {
		
		ArrayList<Integer> listInt = new ArrayList<>();
		
		listInt.add(10);
		listInt.add(20);
		listInt.add(30);
		listInt.add(40);
		
		//System.out.println(listInt);
		
		listInt.remove(1);
		//System.out.println(listInt);
		
		listInt.add(1, 20);
		System.out.println(" After adding " + listInt);
		
		
		ArrayList<String> listString = new ArrayList<>();
		listString.add("Banana");
		listString.add("Apple");
		listString.add("Mango");
		
		//System.out.println(listString);
		
		//System.out.println(listString.get(1));
		
		int sizeOfTheList= listString.size();
		//System.out.println(sizeOfTheList);
		
		//System.out.println(listString.get(listString.size()-1));
		
		Collections.sort(listInt);
		System.out.println(listInt);
		
		int indexOfApple =listString.indexOf("Apple");
		//System.out.println(indexOfApple);
		
		listString.add(1,"Pineapple");
		System.out.println(listString);
		
		listString.clear();
		System.out.println(listString);
		
		ArrayList <Integer> secondList = new ArrayList <>();
		secondList.add(6);
		secondList.add(5);
		
		listInt.addAll(secondList);
		System.out.println(secondList);
		
	}

}
