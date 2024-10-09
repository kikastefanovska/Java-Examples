package mk.iwec.datetimeexample;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println( "Local date" +ld);

		
		LocalTime lt = LocalTime.now();
		System.out.println("Local time " +lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Local Date time: "+ldt);
		//DateTimeFormatter myObjectFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//DateTimeFormatter myObjectFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter myObjectFormat = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
		String formattedDate = ldt.format(myObjectFormat);
		System.out.println("After formatting " +formattedDate);
		
		Month month = Month.JUNE;
		System.out.println("Month " +month);
		System.out.println("Month plus " + month.plus(2));
		
		Duration oneHour = Duration.ofHours(1);
		System.out.println("One hour has:  " +oneHour.getSeconds() + " seconds");
		
		LocalDate newYearsDay = LocalDate.of(2015,Month.JANUARY,1);
		//Period twoMonths = Period.ofMonths(2);
		Period days = Period.ofDays(29);
		LocalDate firstOfFebruary = newYearsDay.plus(days);
		System.out.println(firstOfFebruary);
		
		Year year = Year.of(2020);
		System.out.format("Godina %s %s prestapna", year.toString(),year.isLeap() ? "e" : "ne e");
		
	}

}
