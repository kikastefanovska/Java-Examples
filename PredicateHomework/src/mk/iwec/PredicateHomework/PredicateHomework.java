package mk.iwec.PredicateHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateHomework {

	public static List<String> createLanguagesList() {   
        return new ArrayList<>(Arrays.asList( "Java", "Python", "JavaScript","TypeScript","C++", "C#", "Ruby","Delphy", "Swift", "Kotlin", "Go"));
        }
	
	public static void filter(List<String> languages, Predicate<String> condition) {
	        for (String language : languages) {
	            if (condition.test(language)) {
	                System.out.println(language);
	            }	
	        }
	}
	public static void main(String[] args) {
		List<String> languages = createLanguagesList();	
		
			System.out.println("All languages:");
	        languages.forEach(System.out::println);

	        System.out.println("\n Filtered languages (starts with 'J'):");
	        filter(languages, s -> s.startsWith("J"));
	        
	        System.out.println("\n Filtered languages (ends with 't'):");
	        filter(languages, s -> s.endsWith("t"));
	        
	        System.out.println("\n Filtered languages whose length is greater than 3:");
	        filter(languages, s -> s.length() > 3 );
	        
	        System.out.println("\n Filtered languages whose length is smaller than 3:");
	        filter(languages, s -> s.length() < 3 );
	      
	        System.out.println("\nFiltered languages (contains 'Script'):");
	        filter(languages, s -> s.contains("Script"));
	               
	}

}
