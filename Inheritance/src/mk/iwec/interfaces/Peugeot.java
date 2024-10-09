package mk.iwec.interfaces;

public class Peugeot implements Car {

	@Override
	public void turn(Direction direction) {
		System.out.println ("Turn " + direction);
	}

	@Override
	public void brake() {
		System.out.println("Slow down");
		
	}

	@Override
	public void horn(int duration) {
		String result = "";
		for (int i =0; i <duration; i++)
			result += "tit " ; //result = result + tit;
			System.out.println(result);
	}

}
