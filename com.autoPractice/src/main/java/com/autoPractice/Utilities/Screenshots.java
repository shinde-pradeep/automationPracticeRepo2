package com.autoPractice.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {


	public static String captureScreenshot (WebDriver driver,String scName) throws IOException {
		
		String dt=DateTimeee.getDateTime();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    String scPath=System.getProperty("user.dir")+"\\myScreenshots\\ "+scName+" "+dt+".png";		
	    File dest=new File (scPath);
	    FileHandler.copy(source,dest);
		
		return scPath;
		
	}
	
//	public static String captureScreenshotBase64path (WebDriver driver,String scname) {
//		
//		String dt=DateTimeee.getDateTime();
//
//		String so=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//		
//		 String scPath=System.getProperty("user.dir")+"\\myScreenshots\\ "+scname+" "+dt+".png";		
//		    File dest=new File (scPath);
//		    FileHandler.copyFile(so,dest);
//			
//			return scPath;
//		
//	}

	
}
