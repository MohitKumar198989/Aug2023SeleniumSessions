package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//get the text of placeholder
		
		By email_Id = By.id("input-email");
		By registerLink = By.linkText("Register");
		
//		String placeHolderValue = driver.findElement(email_Id).getAttribute("placeholder");
//		System.out.println(placeHolderValue);
//		String hrefValue= driver.findElement(registerLink).getAttribute("href");
//		System.out.println(hrefValue);
//		
//		String className = driver.findElement(registerLink).getAttribute("class");
//		System.out.println(className);
		
		driver.findElement(email_Id).sendKeys("Tom@gmail.com");
		String text= driver.findElement(email_Id).getAttribute("value");
		System.out.println(text);
		
	}

	public static String doGetElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
