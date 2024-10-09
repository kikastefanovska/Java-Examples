package mk.iwec.methodReferenceExamples;

public class InstanceMethodReference {
	
	public void saySomething() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		
		InstanceMethodReference methodReference = new InstanceMethodReference();
		Sayable sayable = methodReference::saySomething;
		sayable.say();
		
		//anonimen objekt
		Sayable sayable2 =new InstanceMethodReference()::saySomething;
		sayable2.say();
		
	}

}
