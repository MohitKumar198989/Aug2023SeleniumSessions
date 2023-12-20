package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentBrowserWindowMultipleHandler {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {


		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String mainWindowId= driver.getWindowHandle();
		Thread.sleep(3000);
		
		By linkedinEle = By.xpath("//a[contains(@href,'linkedin')]");
		By facebookEle = By.xpath("//a[contains(@href,'facebook')]");
		By twitterEle = By.xpath("//a[contains(@href,'twitter')]");
		By youtubeEle = By.xpath("//a[contains(@href,'youtube')]");
		
	
		switchToWindow(linkedinEle, mainWindowId);	
		System.out.println("-----");
		switchToWindow(facebookEle, mainWindowId);
		System.out.println("-----");
		switchToWindow(twitterEle, mainWindowId);
		System.out.println("-----");
		switchToWindow(youtubeEle, mainWindowId);
		
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it= handles.iterator();
//		
//		while (it.hasNext()) {
//			String windowId = it.next();
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getCurrentUrl());
//			Thread.sleep(1500);
//			
//			if(!windowId.equals(mainWindowId)) {
//				driver.close();
//			 }
//		}		
//		
//		
//		
//		driver.switchTo().window(mainWindowId);
//		System.out.println("main window URL: "+driver.getCurrentUrl());
//	
		
	}
	
	/**
	 * 
	 * @param locator
	 * @param driver
	 * @param mainWindowId
	 * @throws InterruptedException
	 */
	
	public static void switchToWindow(By locator,String mainWindowId) throws InterruptedException {
		
		driver.findElement(locator).click();
		
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
