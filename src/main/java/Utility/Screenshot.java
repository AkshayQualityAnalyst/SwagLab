package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {
	
	public static String getDate() {
		
		
		return new SimpleDateFormat("dd-mm-yy ss-mm-HH").format(new Date());
		
		
	}
	
	

}
