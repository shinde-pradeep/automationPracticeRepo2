package com.autoPractice.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	
	
// generate report using ExtentReports 
	
	public static ExtentReports generateReport (String reportName) {
	
//	String dt=CurrentDateAndTime.getCurrentDateAndTime();
//  we can not enter date before or after report name...shows run time testNG error...InvalidPathException:Illegal char	
//	ExtentSparkReporter htmlReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\myReports\\"+" "+reportName+dt+".html");	

// if path is not mentioned then report will get saved with main files like pom and others	
// ExtentSparkReporter htmlReport=new ExtentSparkReporter(reportName+".html");
	
	ExtentSparkReporter htmlReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\myReports\\"+reportName+".html");

	ExtentReports er=new ExtentReports();
	
	er.attachReporter(htmlReport);
	
	er.setSystemInfo("environment","testing");
	er.setSystemInfo("testingType","regression");
	er.setSystemInfo("testingBy","shinde");

	return er;
	}
	
	
	
	
	
	
}
