package com.autoPractice.POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

public static WebDriver driver;	


// method to open chrome browser	
	
	public static WebDriver openChrome (String url) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
				
		ChromeOptions opt = new ChromeOptions ();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver (opt);

		driver.get(url);	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
public static WebDriver openEdge (String url) {
				
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\edgedriver_win64\\msedgedriver.exe");
				
		WebDriver driver=new EdgeDriver ();

		driver.get(url);	
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
}
