package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NestedIframeHandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		
		//page
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(1500);
		//f1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		//f2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("second crush");
		//f3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("destiny");
		
		//f3-->f1 not valid
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("first crush2");
		
		//f3-->f2-->f1:not valid
//		driver.switchTo().frame("pact2");
//		driver.switchTo().frame("pact1");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("second crush2");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("first crush2");
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		String header= driver.findElement(By.tagName("h3")).getText(); 
		System.out.println(header);
				
		Thread.sleep(1500);
		driver.manage().deleteAllCookies();
		driver.quit();		
	}

}
