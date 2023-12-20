package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); 
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
	
		List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		
//		By selectChoice =By.id("justAnInputBox");
//		By OptionLocator=By.cssSelector("span.comboTreeItemTitle");
		
		for(WebElement e : choicesList) {
			String text= e.getText();
			System.out.println(text);
			if(text.contains("choice 2")) {
				e.click();
				break;
			}
//			try {
//			e.click();// after 15 choice ElementNotIneractableException: element not interactable 
//		
//			}
//			catch(ElementNotInteractableException ex) {
//				System.out.println("Drop down is over ....");
//				break;
//			}
			}
		
		
	}
	
	

}
