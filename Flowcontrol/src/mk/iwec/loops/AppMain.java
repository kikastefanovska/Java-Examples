package mk.iwec.loops;

public class AppMain {

	public static void main(String[] args) {
		Zvezdicka zvezda = new Zvezdicka();
		System.out.println(zvezda.defineString(1,Direction.HORIZONTAL));
		System.out.println(zvezda.defineString(2,Direction.VERTICAL));

	}

}
