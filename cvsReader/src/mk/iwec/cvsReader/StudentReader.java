package mk.iwec.cvsReader;

public class StudentReader extends CSVReaderImpl<Student> {

	@Override
	public Student getInstance(String[] tokens) {
		return new Student (tokens[0].trim(), tokens[1].trim());
	}

}
