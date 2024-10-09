package mk.iwec.inputOutputExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(new File("input.txt"))){
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
