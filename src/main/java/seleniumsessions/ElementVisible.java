package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementVisible {

	public static void main(String[] args) throws InterruptedException {

		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
//		boolean flag = driver.findElement(By.cssSelector(".@@@@img-responsive")).isDisplayed(); // InvalidSelectorException: invalid selector: An invalid or illegal selector was specified
//		System.out.println(flag);
//		
//		WebElement logo = driver.findElement(By.cssSelector(".img-responsive"));
//		System.out.println(logo.isDisplayed());
//		
		
		driver.get("https://classic.freecrm.com/register/");
		
		WebElement sumbit = driver.findElement(By.id("submitButton"));
		System.out.println(sumbit.isDisplayed());
		System.out.println(sumbit.isEnabled());
		
		boolean f1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("f1 "+ f1);
		Thread.sleep(2000);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		Thread.sleep(2000);
		
		boolean f2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("f2 "+ f2);
		
		System.out.println(sumbit.isDisplayed());
		System.out.println(sumbit.isEnabled());
		
		
		
		driver.quit();
		}

}
