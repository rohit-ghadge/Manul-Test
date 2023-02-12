import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// Converting various Date to String conversion
public class Date_To_String {

	public static void main(String[] args) {
		 Date todaysDate = new Date();
	       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	       DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	       DateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");
	       DateFormat df4 = new SimpleDateFormat("MM dd, yyyy");
	       DateFormat df5 = new SimpleDateFormat("E, MMM dd yyyy");
	       DateFormat df6 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
	       try
	       {
	           //format() method Formats a Date into a date/time string. 
	           String testDateString = df.format(todaysDate);
	           System.out.println("String in dd/MM/yyyy format is: " + testDateString);
	           String str2 = df2.format(todaysDate);
	           System.out.println("String in dd-MM-yyyy HH:mm:ss format is: " + str2);
	           String str3 = df3.format(todaysDate);
	           System.out.println("String in dd-MMM-yyyy format is: " + str3);
	           String str4 = df4.format(todaysDate);
	           System.out.println("String in MM dd, yyyy format is: " + str4);
	           String str5 = df5.format(todaysDate);
	           System.out.println("String in E, MMM dd yyyy format is: " + str5);
	           String str6 = df6.format(todaysDate);
	           System.out.println("String in E, E, MMM dd yyyy HH:mm:ss format is: " + str6);

	       }
	       catch (Exception ex ){
	          System.out.println(ex);
	       }

	}

}
