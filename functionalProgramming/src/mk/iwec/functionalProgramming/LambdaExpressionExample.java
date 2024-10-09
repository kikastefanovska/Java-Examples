package mk.iwec.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample {

	public static void main(String[] args) {
//lambda expression without parameters
		//Sayable s =() -> {
		//return "Hello World";	
		//};
//lambda expression with single parameter
		
		Sayable s = (name) -> {
			return "Hello " + name;
		};
		
		//System.out.println(s.say("Hristina"));
		
	// lambda expression without function parentheses
		Sayable s2= name -> {
			return "Hello " + name;
		};
		//System.out.println(s2.say("Hristina2"));
		
		
		Addable ad = (a, b) -> (a+b);
		System.out.println(ad.add(2, 3));
		
		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		list.add("mango");
		
		list.forEach(
				(n) -> System.out.println(n)
		);
	}

}
