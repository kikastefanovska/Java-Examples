package mk.iwec.mapExample;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(3,6,2,7,8);
		list.stream().map(x -> x * 2).forEach(System.out::println);
	}

}
