package mk.iwec.inputOutputExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Reader fr = new FileReader("input.txt");
			int data = fr.read();
			while (data != -1) {
				System.out.print((char)data);
				data = fr.read();
			}
			fr.close();
		} catch (Exception e) {
		
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
