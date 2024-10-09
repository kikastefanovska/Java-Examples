package mk.iwec.consumerExample;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = 
				str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("computer academy");
	}

}
