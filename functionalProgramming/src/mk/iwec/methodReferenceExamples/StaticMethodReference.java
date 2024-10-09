package mk.iwec.methodReferenceExamples;

public class StaticMethodReference {

	
	public static void saySomething() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		Sayable sayable = StaticMethodReference::saySomething;
		sayable.say();
	}

}
