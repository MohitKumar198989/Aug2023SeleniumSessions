package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	
	static WebDriver driver;
	public static void main(String[] args) {
		//1.open the browser: chrome
		//2. enter url
		//3. get the title
		//4.verify the title
		//5. close the browser
		
		//automation steps
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		String browser= "Chrome";
		
		//cross browser logic with top casting
	
		switch (browser.toLowerCase().trim()) {
		case "Chrome":
			driver= new ChromeDriver();
			break;
		case "Firefox":
			driver= new FirefoxDriver();
		case "Edge"	:
			driver = new EdgeDriver();
		case "safari":	
			driver = new SafariDriver();
		default:
			System.out.println("Please pass the right browser....");
			break;
		}
		
		WebDriver driver = new ChromeDriver(); //top casting
		
		driver.get("https://www.google.com");
		String actTitle=  driver.getTitle();
		System.out.println("Title is : " +actTitle);
		
		// verification point/ Checkpoint/act vs exp result : testing
		if (actTitle.equals("Google"))
		{
			System.out.println("Title is correct -- Pass");
		}
		else 
		{
			System.out.println("Title is not correct -- Fail");

		}
		String appUrl = driver.getCurrentUrl();
		System.out.println(appUrl);
		
		if (appUrl.contains("google"))
		{
			System.out.println("url is correct - PASS");
		}
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		
		if (pageSource.contains("Google apps"))
		{
			System.out.println("PASS");
		}
		
		
		//driver.quit();
	}

}
