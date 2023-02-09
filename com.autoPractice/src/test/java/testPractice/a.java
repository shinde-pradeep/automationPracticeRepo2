package testPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.autoPractice.Utilities.DateTimeee;
import com.autoPractice.Utilities.Screenshots;

public class a {
	
//	static WebDriver driver ;

	 
	
public static void main(String[] args) throws InterruptedException, IOException {
		
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		
	Thread.sleep(3000);
	
	Screenshots.captureScreenshot(driver, "tutorial ninja page");
		}
		
		
  
}

