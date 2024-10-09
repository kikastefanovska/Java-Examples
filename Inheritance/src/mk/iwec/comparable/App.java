package mk.iwec.comparable;
import java.util.ArrayList;
import java.util.Collections;
public class App {

	public static void main(String[] args) {
		var students = new ArrayList<Student>();
		
		students.add(new Student("Hristina","Stefanovska"));
		students.add(new Student("Natali","Mitevska"));
		students.add(new Student("Martina","Petrovska"));
		students.add(new Student("Dusan","Krstic"));
		
		Collections.sort(students);
		System.out.println(students);
	}

}
