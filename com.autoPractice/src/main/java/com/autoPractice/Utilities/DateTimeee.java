package com.autoPractice.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeee {

	
	public static String getDateTime() {
		
	DateTimeFormatter dtf=  DateTimeFormatter.ofPattern("dd-mm-yyy hh:mm:ss"); 
	LocalDateTime now= LocalDateTime.now();          //DateTimeFormatter & LocalDateTime...both are classes
	
	String dateAndTime=dtf.format(now);
	
	return dateAndTime;
		
	}
}
