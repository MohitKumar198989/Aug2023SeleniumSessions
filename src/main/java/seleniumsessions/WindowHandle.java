package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {

//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(5000);
		//driver.switchTo().newWindow(WindowType.TAB); //open in the tab
		driver.switchTo().newWindow(WindowType.WINDOW); //new window open
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		
		driver.quit(); //close parent window
		
		//browser tab
		//browser window
		//don't use switch.alert
		
		//switch.window
		//switch.frame
		//switch.alert work only for java script popoup
		
		
		
	}

}
