package mk.iwec.inputOutputExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("bufferWriterOutput");
		BufferedWriter buffer = new BufferedWriter (writer);
		buffer.write(" Software academy ");
		buffer.close();
		System.out.println("Success");
	}

}
