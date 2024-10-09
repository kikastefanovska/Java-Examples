package mk.iwec.loops;

public class Zvezdicka {
	private static final char SYMBOL = '*';
	
	public String defineString(int n, Direction direction) {
		String result= " ";
		for(int i=0; i < n; i++) {
			result += SYMBOL;
			if (direction == Direction.HORIZONTAL) {
				result +='\n';
			}
		}
		return result;
	}	
}
