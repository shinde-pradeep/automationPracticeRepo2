package testPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.autoPractice.Utilities.DateTimeee;

public class DateAndTime {

	public static void main(String[] args) {

		String dt1 = DateTimeee.getDateTime();
		System.out.println("time as per m1 - " + dt1);

		long dt2 = System.currentTimeMillis();

		System.out.println("time as per m2 - " + dt2);

		Date dt3 = new Date();
		System.out.println("time as per Date class - " + dt3);// here date format is - Fri Jan 27 18:58:59 IST 2023

		String dt4=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss").format(new Date());
		System.out.println("time as per Date class - " +dt4);
		
		
	}
}
