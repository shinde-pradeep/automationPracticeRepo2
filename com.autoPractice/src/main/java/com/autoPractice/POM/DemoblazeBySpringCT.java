package com.autoPractice.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoblazeBySpringCT {

// find web elements of this/perticular web page and declare them as private	
@FindBy(xpath="//a[text()='Log in']")private WebElement loginWord;
@FindBy(xpath="//input[@id='loginusername']")private WebElement userNameField;
@FindBy(xpath="//input[@id='loginpassword']")private WebElement passwordField;
@FindBy(xpath="//button[text()='Log in']")private WebElement loginButton;


@FindBy(xpath="//button[text()='Log in']")private WebElement loginButton2;




// constructor
public DemoblazeBySpringCT (WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	
}
	
//methods to perform actions on web element available on this/perticular web page	

public void clickOnLoginWord(WebDriver driver) {
	
	WebDriverWait w2= new WebDriverWait (driver,Duration.ofMillis(3000));
	w2.until(ExpectedConditions.visibilityOf(loginWord));
	
	loginWord.click();
}
public void enterUsername(WebDriver driver,String userName) {

	FluentWait<WebDriver> w3= new FluentWait<WebDriver>(driver);
	w3.withTimeout(Duration.ofMillis(3000));
	w3.pollingEvery(Duration.ofMillis(200));
	w3.ignoring(Exception.class);
	w3.until(ExpectedConditions.visibilityOf(userNameField));
	
	userNameField.sendKeys(userName);
}
public void enterPassword(WebDriver driver,String pass) {
	
	passwordField.sendKeys(pass);
}
public void clickOnLoginButton(WebDriver driver) {
	
	loginButton.click();
}






}
