package mk.iwec.cvsReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CSVReaderImpl <T> implements CSVReader<T>{

	@Override
	public List<T> read(String fileName, String delimeter) {
		List <T> result = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(fileName))){
			String line;
			while ((line = in.readLine()) != null) {
				String [] tokens = line.split(delimeter);
				T obj= getInstance(tokens);
				if (obj != null) {
					result.add(obj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public abstract T getInstance (String[]tokens);

	}


