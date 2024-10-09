package mk.iwec.cvsReader;

import java.util.List;

public interface CSVReader<T> {
	
	public List<T> read(String fileName, String delimeter);
}
