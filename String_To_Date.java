import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

// Convert different format String to Date in Java
public class String_To_Date {

    public static void main(String[] args)
    {
    	
    	//LocalDate
    	String strDate = "2021-07-23";
    	LocalDate date = LocalDate.parse(strDate);
    	System.out.println(date);
    		
    	//LocalDateTime
    	String strDateTime = "2021-07-23T10:30:59";
    	LocalDateTime dateTime = LocalDateTime.parse(strDateTime);
    	System.out.println(dateTime);
    	
    	// Date of Format- YYYY-MM-DD
    	String strDate1 = "2021-07-23";
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate d1 = LocalDate.parse(strDate1, f1);
		System.out.println(d1);
		
		// Date of Format- Day name, DD Month Name, YYYY
		String strDate2 = "Friday, 23/07/2021";
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE, d/M/yyyy");
		LocalDate d2 = LocalDate.parse(strDate2, f2);
		System.out.println(d2);
		
		// Date of Format- Three letter day name, DD Month Name, YYYY
		String strDate3 = "Fri, 23 July, 2021";
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, d MMMM, yyyy");
		LocalDate d3 = LocalDate.parse(strDate3, f3);
		System.out.println(d3);
		
		// Date and Time of Format- DD-MM-YYYY HH:MM:SS AM/PM
		String strDate4 = "23-07-2021 10:30:59 AM";
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("d-M-yyyy HH:mm:ss a");
		LocalDate d4 = LocalDate.parse(strDate4, f4);
		System.out.println(d4);
		
		// Date of Format- YYYY-MM-DD
		String strDate5 = "2021-07-23";
		SimpleDateFormat f5 = new SimpleDateFormat("yyyy-M-d");
		try
		{
			Date d5 = f5.parse(strDate5);
			System.out.println(d5);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
		
		// Date of Format- Three letter day name, DD Month Name, YYYY
		String strDate6 = "Fri, 23 July, 2021";
		SimpleDateFormat f6 = new SimpleDateFormat("EEE, d MMM, yyyy");
		try
		{
			Date d6 = f6.parse(strDate6);
			System.out.println(d1);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
		
		// Date and Time of Format- DD-MM-YYYY HH:MM:SS AM/PM
		String strDate7 = "23-07-2021 10:30:59 AM";
		SimpleDateFormat f7 = new SimpleDateFormat("d-M-yyyy HH:mm:ss a");
		try
		{
			Date d7 = f7.parse(strDate7);
			System.out.println(d1);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
		
		// with Timezones
		String strDate8 = "23-07-2021 10:30:59Z";
		
		SimpleDateFormat f8 = new SimpleDateFormat("d-M-yyyy HH:mm:ss");
		SimpleDateFormat f9 = new SimpleDateFormat("d-M-yyyy HH:mm:ss");
		f9.setTimeZone(TimeZone.getTimeZone("GMT"));
		try
		{
			Date d8 = f8.parse(strDate8);
			Date d9 = f9.parse(strDate8);
			System.out.println(d1);
			System.out.println(d2);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
    }
    
}
