package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnShadowDom {

	public static void main(String[] args) throws InterruptedException {

		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://books-pwakit.appspot.com/");
		
		Thread.sleep(3000);
		
		String searchBook = "return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//html element ---> Selenium WebElement
		WebElement tea = (WebElement)js.executeScript(searchBook);
		tea.sendKeys("Book");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
