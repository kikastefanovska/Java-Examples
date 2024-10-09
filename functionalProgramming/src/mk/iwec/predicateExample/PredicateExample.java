package mk.iwec.predicateExample;

import java.util.function.Predicate;

public class PredicateExample {

	private static void print(Car car, Predicate<Car> trait) {
		if (trait.test(car) == false) {
			System.out.println(car);
		}
	}

	public static void main(String[] args) {
		print(new Car("Mercedes", true), c -> c.isAutomaticTransmission());
		print(new Car("BMW", false), c -> c.isAutomaticTransmission());
	}
}
