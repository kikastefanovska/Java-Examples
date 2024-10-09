package mk.iwec.geometry;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point (10,20);
		Point p2 = new Point (10,20);
		Point p3 = p1;
		
		//equals
		//System.out.println(p1.equals(p2));
		//System.out.println(p1==p2);
		//System.out.println(p1.equals(p3));
		
		//hashCode
		Integer i= 5;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println("I hasCode " +i.hashCode());
		
		// toString
		System.out.println("p3 = " + p1);
		
		
		
		
		
	}
	
	

}
