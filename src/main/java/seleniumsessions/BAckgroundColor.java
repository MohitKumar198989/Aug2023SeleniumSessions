package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BAckgroundColor {
	
	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://classic.crmpro.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		
		Rectangle rect = element.getRect();	
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());

		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		//element.getRect().getDimension().getHeight();
		
		int x=element.getLocation().x;
		int y = element.getLocation().y;
		
		
		
	}

}
