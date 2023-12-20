package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {

		//right click or the context click
		//context menu  
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();
		
		// use of class - li.context-menu-icon so that we can not include other element.
		List<WebElement> optionsList = driver.findElements(By.cssSelector("li.context-menu-icon"));
		
		System.out.println(optionsList.size());
		
//		for (WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		selectRightOption(optionsList, "Copy");
		
	}
/*
 * WebElement and String value 
 * 
 */
	public static void selectRightOption(List<WebElement> elem, String value) {
		for (WebElement e : elem) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
