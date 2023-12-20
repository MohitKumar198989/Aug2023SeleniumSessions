package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandelWithoutSelect {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/30-day-free-trial/");
			
			By country = By.cssSelector("select#Form_getForm_Country>option");
			
			
	}
		public static void selectDropDownValue(By locator , String value) {
			List<WebElement> optionsList= driver.findElements(locator);
			for (WebElement e: optionsList) {
				String text= e.getText();
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
			
		}
}
