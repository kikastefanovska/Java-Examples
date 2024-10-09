package mk.iwec.hangmen;

public class Appbesilka {

	public static void main(String[] args) {
		
		Hangman hangmen = new Hangman (10);
		String result = hangmen.play();
		System.out.println(result);
	}

}
