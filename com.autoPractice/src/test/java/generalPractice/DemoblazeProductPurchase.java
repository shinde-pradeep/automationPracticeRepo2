package generalPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoblazeProductPurchase {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.demoblaze.com");
	dr.manage().window().maximize();

// login to store	
	WebElement loginWord=dr.findElement(By.xpath("//a[text()='Log in']"));
	loginWord.click();
	
	WebElement userName=dr.findElement(By.xpath("//input[@id='loginusername']"));
	   WebDriverWait w2=new WebDriverWait (dr,Duration.ofMillis(3000));    //Explicit wait...............
	   w2.until(ExpectedConditions.visibilityOf(userName));
	userName.sendKeys("shinde12345");
	WebElement pass=dr.findElement(By.xpath("//input[@id='loginpassword']"));
	pass.sendKeys("shinde12345");
	WebElement loginButton=dr.findElement(By.xpath("//button[text()='Log in']"));
	loginButton.click();
System.out.println("login to store successfully");
	
Thread.sleep(2000);
//monitor add to cart	
	WebElement monitorWord=dr.findElement(By.xpath("//a[text()='Monitors']"));
	      JavascriptExecutor jse= (JavascriptExecutor)dr;                         //JavascriptExecutor..............
	      jse.executeScript("arguments[0].scrollIntoView(true)",monitorWord);
	monitorWord.click();
Thread.sleep(2000);	
	WebElement appleMonitor24=dr.findElement(By.xpath("//a[text()='Apple monitor 24']"));
          jse.executeScript("arguments[0].scrollIntoView(true)",appleMonitor24);
	appleMonitor24.click();

Thread.sleep(2000);		
	WebElement addToCartWord= dr.findElement(By.xpath("//a[text()='Add to cart']"));
	addToCartWord.click();
	      w2.until(ExpectedConditions.alertIsPresent());
	        Alert a=dr.switchTo().alert();         //alert handle.................alert ia a 'interface' with 4 methods
         	a.accept();
	WebElement homeWord= dr.findElement(By.xpath("//a[@class='nav-link'] [@href='index.html']"));
	homeWord.click();
	
Thread.sleep(2000);	
//laptops add to cart	
	WebElement laptopsWord=dr.findElement(By.xpath("//a[text()='Laptops']"));
           jse.executeScript("arguments[0].scrollIntoView(true)",laptopsWord);
    laptopsWord.click();
Thread.sleep(2000);		
	WebElement macbookPro =dr.findElement(By.xpath("//a[text()='MacBook Pro']"));
    jse.executeScript("arguments[0].scrollIntoView(true)",macbookPro);
	macbookPro.click();

Thread.sleep(2000);
    WebElement addToCartWord2= dr.findElement(By.xpath("//a[text()='Add to cart']"));
	addToCartWord2.click();                         // clicking using old locator...StaleElementReferenceException
Thread.sleep(2000);	
    Alert a2=dr.switchTo().alert();
 	a2.accept();
 	
Thread.sleep(2000);    
// go to cart 	
 	WebElement cartWord=dr.findElement(By.xpath("//a[@id='cartur']"));
 	cartWord.click();
 	
Thread.sleep(2000);     	
//table handeling
 	List <WebElement> priceOfAllItems=dr.findElements(By.xpath("//table//tbody//tr//td[3]"));
 	      int noOfTotalItemsInCart=priceOfAllItems.size();
 	      System.out.println("no Of Total Items In Cart are - "+noOfTotalItemsInCart);
 	
 	//1...................
 	      
 	Integer [] itemPriceArray=new Integer[priceOfAllItems.size()];
 	
	for(int aa=0;aa<=itemPriceArray.length-1;aa++)
	{
		itemPriceArray[aa]=Integer.parseInt(priceOfAllItems.get(aa).getText().trim());
	}
	 

System.out.println("item prices in cart are - "+
Arrays.toString(itemPriceArray));

Arrays.sort(itemPriceArray);
System.out.println("sorted (asc) item prices in cart are - "+Arrays.toString(itemPriceArray));	

Arrays.sort(itemPriceArray,Collections.reverseOrder());
System.out.println("reverse sorted (dsc) item prices in cart are - "+Arrays.toString(itemPriceArray));	

	//2..............................

int sumOfItemPrice=0;
for(int aaa=0;aaa<=itemPriceArray.length-1;aaa++)
{
	sumOfItemPrice = sumOfItemPrice + itemPriceArray[aaa];
}

	System.out.println("sum of item price is - "+sumOfItemPrice);
	
// comparing our sum and system generated sum
	
	WebElement systemSumWebElement=dr.findElement(By.xpath("//h3[@id='totalp']"));
	int systemSum = Integer.parseInt(systemSumWebElement.getText());

	if(sumOfItemPrice==systemSum)
	{
		System.out.println("system sum and my sum both are same = "+sumOfItemPrice);
	}
	else
	{
		System.out.println("system sum and my sum both are not same \nmySum = "+sumOfItemPrice + "\nsystem sum is = "+systemSum);
	}
	
	
	
}	
	
	
	
}
