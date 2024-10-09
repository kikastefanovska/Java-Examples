package mk.iwec.loops;

public class LoopsDemo {
	
	public int  sumFor(int n) {
		int sum=0;
		for(int i=1; i <= n; i++) {
			sum= sum+1; 	
			System.out.println(i);
		}
		return sum;
	}

	
	public int sumWhile(int n) {
		int sum=0;
		int i=1;
		while (i <= n) {
			sum= sum+1; 	
			System.out.println(i);
			i++;
		}
		return sum;
	}
}