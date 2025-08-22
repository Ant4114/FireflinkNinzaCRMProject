package ninzaCRM.genericUtlities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consists of generic methods related to java operations
 * @author Antara Pal
 */
public class JavaUtility {
	/**
	 * This method will generate random no. and return it to caller method
	 * @return
	 */
	public int getRandomNumber() {
		Random r=new Random();
		int random = r.nextInt(1000);
		return random;
		
	}
	/**
	 * This method is capture current system date and time and return to caller method
	 * @return
	 */
	public String getdate() {
		Date d=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
        String formatDate = sdf.format(d);
        return formatDate;
	}

}
