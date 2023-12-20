package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgin_Total_Image_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BrowserUtil brUtil= new BrowserUtil();
//		ElementUtil eleUtil = new ElementUtil(brUtil.launchBrowser("Chrome"));
//		brUtil.launchURL("");
//		

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement>totalImage= driver.findElements(By.tagName("img"));
		System.out.println(totalImage.size());
//		for (WebElement e: totalImage) {
//			System.out.println(totalImage.size());	
//		}
//		
		
	}

}
