package mk.iwec.filterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterExample {

	public static void main(String[] args) {
	List<String> names = Arrays.asList("Ana","Marko","Stefan","Dusan");
	List<String> result =names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
	
	for(String name: result) {
		System.out.println(name);
	}
	
	
	}

}
