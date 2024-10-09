package mk.iwec.inheritance;

public class Appmain {

	public static void main(String[] args) {
		
		Dog labrador = new Dog ();
		
		labrador.name="Max";
		labrador.display();

		//labrador.eat();
		
		//TV tv = new TV ("Black");
		//System.out.println(tv);
		
		Monkey monkey = new Monkey();
		//monkey.eat();
		
		Animal animal = new Animal();
		//animal.eat();
		
		Animal dog = new Dog();
		dog.eat();
		
		System.out.println(animal instanceof Animal);
	}

}
