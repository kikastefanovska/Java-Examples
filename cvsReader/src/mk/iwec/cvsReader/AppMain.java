package mk.iwec.cvsReader;

import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		CSVReader<Student> csvReader = new StudentReader();
		List<Student> students= csvReader.read("studenti.cvs", ",");
		System.out.println(students);
	}

}
