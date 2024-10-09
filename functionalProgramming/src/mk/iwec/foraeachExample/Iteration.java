package mk.iwec.foraeachExample;

import java.util.Arrays;
import java.util.List;

public class Iteration {
	
	private List<String> names = Arrays.asList("Ana","Marko","Stefan","Dusan");
	
	private void iterateAsPriotJava8() {
		for(String name: names) {
			System.out.println(name);
		}
	}
	public void iterationWithLambdaExpression() {
		names.forEach(x-> System.out.println(x) );
	}
	
	public void iterationWithMethodReference() {
		names.forEach(System.out::println);	}
	
	public static void main(String[] args) {
		System.out.println("Iteration with for each loop");
		Iteration iteration = new Iteration();
		iteration.iterateAsPriotJava8();
		
		System.out.println("\nIteration with Lambda expression");
		iteration.iterationWithLambdaExpression();
		
		System.out.println("\nIteration with Method Reference");
		iteration.iterationWithMethodReference();

	}

}
