package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(By.id("input-email")), "naveen@gmail.com").perform();
		act.sendKeys(driver.findElement(By.id("input-password")), "naveen@gmail.com").perform();
		
		act.click(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")));
		//click on the middle of given element. Equivalent to : Action .moveToElement(onElement).click() 
		
		driver.findElement(By.id(""));
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
}
