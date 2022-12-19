package DateandTimeAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConversion {

	public static void main(String[] args) {
	//Capturing today's date
		Date today = new Date();
		
		//Displaying this date on ISTtimezone
		DateFormat df = new SimpleDateFormat("dd-mm-yy HH:MM:SS z");
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = df.format(today);
		System.out.println("Date in Indian TimeZone (IST) : " + IST);
		
		//Displaying date on Pacific TimeZone
		df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String PST = df.format(today);
		System.out.println("Date in PST TimeZone : " + PST);
	}
	
	
	
}
