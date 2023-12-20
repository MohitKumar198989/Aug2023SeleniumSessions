package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingDisableElements {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://classic.freecrm.com/register/");
//		
//		Thread.sleep(3000);
//		
//		WebElement sumbit = driver.findElement(By.id("submitButton"));
////		sumbit.click();
//
//		Actions act = new Actions(driver);
//		act.click(sumbit).perform();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		//pwd.sendKeys("test@123");// ElementNotInteractableException: element not interactable
		
		//Actions class is not giving the any exception
		Actions act = new Actions(driver);
		act.click(pwd).sendKeys("test@123").perform();
		
		//null keys using sendkeys
		
		driver.findElement(By.id("fname")).sendKeys(null);
		
		driver.quit();
	}
	

}
