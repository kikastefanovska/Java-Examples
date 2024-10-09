 package mk.iwec.inputOutputExamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try {
			Writer fw = new FileWriter("outputFileWriter");
			String content = "Hello World";
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
