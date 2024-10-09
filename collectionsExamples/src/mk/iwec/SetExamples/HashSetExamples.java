package mk.iwec.SetExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
	
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Computer");
		hashSet.add("Science");
		hashSet.add("Development");
		
		System.out.println(hashSet);
		
		hashSet.remove("Development");
		System.out.println(hashSet);
	
		hashSet.clear();
		System.out.println(hashSet);
	}

}
