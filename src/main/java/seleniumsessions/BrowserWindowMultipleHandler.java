package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserWindowMultipleHandler {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String mainWindowId= driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(!windowId.equals(mainWindowId)) {
				driver.close();
			 }
		}		
		
		driver.switchTo().window(mainWindowId);
		System.out.println("main window URL: "+driver.getCurrentUrl());
		
		
	}

}
