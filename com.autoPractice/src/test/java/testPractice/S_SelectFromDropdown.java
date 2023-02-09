package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S_SelectFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		dr.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement dropDown = dr.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sel=new Select(dropDown);
		sel.selectByVisibleText("Andorra");
//		sel.selectByValue("AFG");
//		sel.selectByIndex(9);
	System.out.println(sel.isMultiple());
	}
}
