package mk.iwec.matrix;

public class App {

	public static void main(String[] args) {

		int rows=2;
		int columns = 3;
		//int [] [] m = {{10,20,30},{44,22,12}};	
		
		int value= 1;
		int [] [] m = new int [rows] [columns];
		for (int i= 0; i<rows; i++) {
			for (int j=0; j< columns; j++) {
				m[i][j] = value;
				System.out.println("m[" +i+ "], [" +j+ "]");
				value++;
			}
			
		}
	}

}
