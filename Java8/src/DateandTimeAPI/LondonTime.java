package DateandTimeAPI;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LondonTime {

	public static void main(String[] args) {
		  Date d1 = new Date();
		  
	        // creating a new locale for England Format
	        Locale locEngland = new Locale("en", "ch");
	  
	        // initializing the date formatter and converting
	        // the date
	        DateFormat de = DateFormat.getDateInstance(
	                        DateFormat.FULL, locEngland);
	  
	        System.out.println("England Format: "
	                           + de.format(d1));
	  
	}

}
