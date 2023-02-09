package generalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
	dr.manage().window().maximize();	

	Thread.sleep(2000);
	WebElement checkboxBeforeOlaName=dr.findElement(By.xpath("//table[@id='customers']//tr[4]//td[2]//preceding-sibling::td//input"));	
	checkboxBeforeOlaName.click();
	
	Thread.sleep(2000);
	WebElement knowMoreWordNextToCalifornia=dr.findElement(By.xpath("//table[@id='customers']//tr[7]//td[4]//following-sibling::td//a"));	
	knowMoreWordNextToCalifornia.click();
	
//....//preceding:://{value}        ...magil sagle (all previous web elements)
//....//preceding-sibling:://{value}...just magcha WebElement
	
//....//following:://{value}        ...nantar che sagle (all web elements after that web element)
//....//following-sibling:://{value}...just nantarcha WebElement	
	
	
	
	
}
}