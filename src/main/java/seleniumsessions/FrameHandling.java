package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		//driver.switchTo().frame(2); 
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String text= driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//getting exection - tag not find
		
		//Browser
			//page---elements
				//frame -- elements
				//frame -- elements
		
		//2 types of frames
		//1. frame tag-- deprecated --OLD --not recommended by w3c 
		//2. iframe tag  -- new w3c
		
 		
	}

}
