package seleniumsessions;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login ");
		driver.get("https://classic.crmpro.com/");
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//sel+java/py/ruby
		//JavascriptExecutor -- Interface
		//RemoteWebDriver implements JavascriptExecutor
		//JavascriptExecutor -->method executeScript(script)
		//script -->executeScript(script)--> it will be execute on the browser - page 
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil= new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJs() ;
//		System.out.println(title);
//		
//		jsUtil.generateJSAlert("Hello"); 
		
		
//		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(pageText);
//		if(pageText.contains("Alerts & Reminders")) {
//			System.err.println("Alerts & Reminders---PASS");
//		}
		
//		Thread.sleep(1000);
//		jsUtil.scrollPageDown();
//		Thread.sleep(1000);
//		jsUtil.scrollPageUp();
//		
		WebElement callsEle = driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));
//		//jsUtil.scrollIntoView(callsEle);
//		jsUtil.drawBorder(callsEle);
		
//		WebElement loginForm = driver.findElement(By.id("hs-login"));
//		//jsUtil.drawBorder(loginForm);
//		jsUtil.flash(loginForm);
		
//		WebElement userName = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		jsUtil.flash(userName);
//		userName.sendKeys("test@gmail.com");
//		jsUtil.flash(pwd);
//		pwd.sendKeys("test@123");


//		WebElement rem = driver.findElement(By.id("remember"));
//		jsUtil.clickElementByJS(rem);
		
		//WebElement userName = driver.findElement(By.id("input-email"));
		jsUtil.sendKeysUsingWithId("input-email", "tom@gmail.com");
	
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
