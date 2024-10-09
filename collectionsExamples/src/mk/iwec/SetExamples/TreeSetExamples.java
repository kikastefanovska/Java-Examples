package mk.iwec.SetExamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		Set <String> treeSet = new TreeSet<>();
		
		treeSet.add("Computer");
		treeSet.add("Science");
		treeSet.add("Development");
		
		System.out.println(treeSet);
		
		Set <Integer> treeSetInt = new TreeSet<>();
		
		treeSetInt.add(10);
		treeSetInt.add(5);
		treeSetInt.add(12);
		
		System.out.println(treeSetInt);
		
	}

}
