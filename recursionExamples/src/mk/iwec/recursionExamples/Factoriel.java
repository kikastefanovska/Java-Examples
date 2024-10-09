package mk.iwec.recursionExamples;

public class Factoriel {

	public static int factoriel (int n) {
		if (n!= 0) 
			return n * factoriel(n-1);
		else
			return 1;
	 
		}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factoriel(5));
	}

}
