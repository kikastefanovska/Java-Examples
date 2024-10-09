package mk.iwec.interfaces;

public class App {

	public static void main(String[] args) {
	 Peugeot car = new Peugeot();
	 car.turn(Direction.LEFT);
	 car.brake();
	 car.horn(4);
	}

}
