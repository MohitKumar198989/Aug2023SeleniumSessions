package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By aboutUSLink = By.linkText("About Us");

		driver.findElement(aboutUSLink).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		// get time out exception i.e 5 sec gone
//		// ExpectedConditions.titleContains("About") give you an exception
//
//		if (wait.until(ExpectedConditions.titleContains("About"))) {
//			System.out.println(driver.getTitle());
//			
//		} 
//		else {
//			System.out.println("Title is not present");
//		}
		
		String title= waitForTitleContains("About11", 5);
		System.out.println(title);
		
		
	
		}

	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
			}	
		}
		catch (TimeoutException e){
			System.out.println(titleFraction +"title value is not present....");
			e.printStackTrace();
 		}
		return null;
		
	}
	

	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
			}	
		}
		catch (TimeoutException e){
			System.out.println(title +"title value is not present....");
			e.printStackTrace();
 		}
		return null;
		
	}
	
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getTitle();
			}	
		}
		catch (TimeoutException e){
			System.out.println(urlFraction +"url value is not present....");
			e.printStackTrace();
 		}
		return null;
		
	}
	
	public static String waitForURLToBe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getTitle();
			}	
		}
		catch (TimeoutException e){
			System.out.println(url +"url value is not present....");
			e.printStackTrace();
 		}
		return null;
		
	}
	
	

}
