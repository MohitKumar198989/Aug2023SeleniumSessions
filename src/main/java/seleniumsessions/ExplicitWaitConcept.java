package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		//ExplicitWait : concept of dynamic wait for the specific element or non web element like alert  
		//on the basis of some expected conditions
		//wait(I) until(); <---- FluentWait(Class) until(){} + other methods<----WebDriverWait(class)
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId= By.id("input-email");
		//By emailId= By.id("input-email11");	
		By password= By.id("input-password");
		By loginButton= By.xpath("//input[@value='Login']");
	    By aboutUSLink=By.linkText("About Us");



//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement email_ele= wait.until(ExpectedConditions.presenceOfElementLocated(emailId));	
//	    email_ele.sendKeys("test@gmail.com");
	    
	    waitForPersenceOfElement(emailId, 10).sendKeys("test@gmail.com");
		
	    //10 secs:
	    //2 secs:
	    //ignored : 8 secs
	    
		//after secs also element is not present :  TimeoutException + no such element:
		
	    driver.findElement(password).sendKeys("test@123");
	    driver.findElement(loginButton).click();
	    
	    
	    //waitForPersenceOfElement(aboutUSLink, 5).click();
	    waitForVisibilityOfElement(aboutUSLink, 5).click();
	    Thread.sleep(3000);
	    driver.quit();
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForPersenceOfElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	    
	}
	/**
	 *  An expectation for checking that an element is present on the DOM of a page and visible.
	 *  Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForVisibilityOfElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
	    
	}
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForVisibilityOfElements(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));	
	    
	}
	
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForPresenceOfAllElements(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));	
	    
	}
	
	
	public static void doClickwithWait(By locator, int timout) {
		waitForVisibilityOfElement(locator, timout).click();
	}
 
	public static void doSendKeysWait(By locator, String value, int timout) {
		waitForVisibilityOfElement(locator, timout).sendKeys(value);;
	}
	
}
