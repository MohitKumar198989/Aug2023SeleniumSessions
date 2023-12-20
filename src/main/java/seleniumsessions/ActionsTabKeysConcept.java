package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeysConcept {
static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver =new ChromeDriver();

		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		WebElement firstName=driver.findElement(By.id("input-firstname"));
//		
//		Actions act =new Actions(driver);
//		
//		act.sendKeys(firstName, "Varna")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys("automation")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys("automation@gmail.com")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys("9999999")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.build().perform();		  
//		
		driver.get("https://www.amazon.com/");
		
		Actions act =new Actions(driver);
		Action action =act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		 .sendKeys(Keys.TAB)
		 	.sendKeys("macbook pro")
		 		.sendKeys(Keys.ENTER).build();
		
		action.perform(); 
	}

}
