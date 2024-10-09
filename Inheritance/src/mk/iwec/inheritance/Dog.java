package mk.iwec.inheritance;

public class Dog extends Animal {
	
		
		public Dog(){
			System.out.println("dog constructor");
		}
	public void display() {
			System.out.println("My name is " + name);
		}
		public void bark() {
			System.out.println("Dog bark aw aw");
		}
		
		@Override
		public void eat() {
			System.out.println("I  eat dog food");
			
		}
		
		
}
