package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserWindowHanlde {
	
	public static void main(String[] args) throws InterruptedException {
		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handles = driver.getWindowHandles();  
		Iterator<String> it= handles.iterator();
		 
		String mainWindowId = it.next();
		System.out.println("main window id: "+mainWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: "+childWindowId);

		//switch work :
		driver.switchTo().window(childWindowId);
		System.out.println("child window URL:"+driver.getCurrentUrl());
		
		driver.close();//close the sub window
		
		//back to main window
		
		driver.switchTo().window(mainWindowId);
		System.out.println("Main window URL: "+driver.getCurrentUrl());

		driver.quit();
		
	}

}
