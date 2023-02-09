package com.autoPractice.POMtests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.autoPractice.POJO.OpenBrowser;
import com.autoPractice.POM.DemoblazeBySpringCT;
import com.autoPractice.Utilities.Parametrization;
import com.autoPractice.Utilities.Reports;
import com.autoPractice.Utilities.Screenshots;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class DemoblazeBySpringCTTest {

WebDriver driver;
ExtentReports report;
ExtentTest test;

@BeforeClass
public void generateReport() {
	report=Reports.generateReport("ok report name");
}

@BeforeMethod
public void openBrowser() {
	driver=OpenBrowser.openChrome("https://www.demoblaze.com/");
}



@Test (priority=1,enabled=false)
public void test_001_loginToDemoblazeProductStore() throws EncryptedDocumentException, IOException, InterruptedException {

test=report.createTest("test_001_loginToDemoblazeProductStore");
	DemoblazeBySpringCT demoblazeBySpringCT= new DemoblazeBySpringCT(driver);
	
	demoblazeBySpringCT.clickOnLoginWord(driver);
test.info("click on login word on page 1 successfully");
	     String userNameFromSheet=Parametrization.getSheetData("passwords",4,3);
	demoblazeBySpringCT.enterUsername(driver, userNameFromSheet);
	     String passFromSheet=Parametrization.getSheetData("passwords",4,4);
	demoblazeBySpringCT.enterPassword(driver, passFromSheet);
	demoblazeBySpringCT.clickOnLoginButton(driver);
test.info("click on login button successfully");	

Thread.sleep(3000);
	String actualPageTitle=driver.getTitle();
	String ExpectedPageTitle="STORE";
	
	boolean titleStatus;
if(actualPageTitle==ExpectedPageTitle)
{
	titleStatus=true;
}
else 
{
	titleStatus=false;
}
	
	SoftAssert softAssert=new SoftAssert ();
	softAssert.assertTrue(titleStatus,"demoblaze product store title is correct...login successfull");
    softAssert.assertAll();
}

@Test(priority=2,enabled=false)
public void test_002_loginToDemoblazeProductStore() throws EncryptedDocumentException, IOException {
	
	DemoblazeBySpringCT demoblazeBySpringCT= new DemoblazeBySpringCT(driver);
	
	demoblazeBySpringCT.clickOnLoginWord(driver);
	     String userNameFromSheet=Parametrization.getSheetData("passwords",4,3);
	demoblazeBySpringCT.enterUsername(driver, userNameFromSheet);
	     String passFromSheet=Parametrization.getSheetData("passwords",4,4);
	demoblazeBySpringCT.enterPassword(driver, passFromSheet);
	demoblazeBySpringCT.clickOnLoginButton(driver);

	String actualPageTitle=driver.getTitle();
	System.out.println("actual title is - "+actualPageTitle);
	String ExpectedPageTitle="STORE";
	
	boolean titleStatus;
if(actualPageTitle==ExpectedPageTitle)
{
	titleStatus=true;
}
else 
{
	titleStatus=false;
}
	
    SoftAssert softAssert=new SoftAssert ();
	softAssert.assertFalse(titleStatus,"demoblaze product store title is not correct...");
    softAssert.assertAll();
}

@AfterMethod
public void collectResults(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"test success - "+result.getName());
		
	}
	else if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"test failed - "+result.getName());
		test.log(Status.FAIL,"test failed exception is - "+result.getThrowable());
		
		String scPath=Screenshots.captureScreenshot(driver,result.getName());
		test.addScreenCaptureFromPath(scPath);
		
//		String base64Path=Screenshots.
//		test.addScreenCaptureFromBase64String(base64Path);
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"test skipped - "+result.getName());
	}
	else
	{
		System.out.println("test result is other thsn success,failure,skip");
	}
	
	
}

@AfterMethod(enabled=false)
public void closeBrowser() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}

@AfterClass
public void flushResults() {
	report.flush();

}





}
