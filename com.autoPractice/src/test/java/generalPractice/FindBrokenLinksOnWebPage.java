package generalPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinksOnWebPage {

	public static void main(String[] args) {
		
		String url ="";
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
	       	System.out.println("links available on this page are - "+links.size());
		Iterator<WebElement> i=links.iterator();
		
		while(i.hasNext())
		{
			url=i.next().getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("url is empty - "+url);
				continue;
			}
			
			try 
			{
				HttpURLConnection con = (HttpURLConnection)(new URL (url).openConnection());
				con.setRequestMethod("HEAD");
				con.connect();
				int respCode =con.getResponseCode();
	            String rm=con.getResponseMessage();
				
				System.out.println("below likn response code is - "+respCode);
				System.out.println("below link response msg is - "+rm);
				
				
				if(respCode>=400)
				{
					System.out.println("url is invalid/broken - "+url);
				}
				else 
					{
					System.out.println("url is valid - "+url);	
					}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	
		
		
		
     }
	
}
