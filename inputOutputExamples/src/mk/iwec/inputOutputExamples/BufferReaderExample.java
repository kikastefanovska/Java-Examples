package mk.iwec.inputOutputExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("bufferWriterOutput");
		BufferedReader bufferedReader = new BufferedReader(reader);

		int i;
		while ((i = bufferedReader.read()) != -1) {
			System.out.print((char) i);
		}
		bufferedReader.close();
		reader.close();

	}
}