package mk.iwec.flowcontrol;

public class ConditonalsDemo {

	public int calc(int x , int y) {
		if (x % 2 == 0 && y%2==0) {
			return x+y;
		}
		else {
			return x*y;
		}
	}
}
