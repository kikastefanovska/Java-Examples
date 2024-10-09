package mk.iwec.methodReferenceExamples;

public class ConstructorReference {

	public static void main(String[] args) {
		Messageable msg = Message:: new;
		msg.getMessage("Hello");

	}

}
