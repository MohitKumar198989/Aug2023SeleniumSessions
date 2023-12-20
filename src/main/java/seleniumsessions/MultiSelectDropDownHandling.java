package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); 
		driver.get("https://html.com/attributes/select-multiple/");
		
		//driver.findElement(By.xpath("//select"));
//		 select.deselectAll();
		
		By dropDownLocator= By.xpath("//select");
		By optionLocator = By.xpath("//select/option");
		//TC 1: multiple values
		//selectDropDownMultipleValues(dropDownLocator,optionLocator, "American flamingo", "Greater flamingo", "Lesser flamingo");
		
		//TC 2: Single value
		//selectDropDownMultipleValues(dropDownLocator,optionLocator, "American flamingo");
		
		//TC 3: All values
		selectDropDownMultipleValues(dropDownLocator,optionLocator, "all");
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isDropDownMultipleVaules(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple()?true:false;
	}
	 /**
	  * This method is used to select the value from the drop down . It can selet
	  * 1.single selection
	  * 2.Multiple selection 
	  * 3.All selection : please pass "all" as a value to select all the values
	  * @param locator
	  * @param values
	  */
	public static void selectDropDownMultipleValues(By locator,By optionLocator, String... values) {
		Select select = new Select(getElement(locator));
		if (isDropDownMultipleVaules(locator)) {
			
			if (values[0].equalsIgnoreCase("all")){
//				List<WebElement> options = select.getOptions();
//				select.selectByVisibleText(value);
				
				List<WebElement> options=driver.findElements(optionLocator);
				for(WebElement e: options ) {
					e.click();
				}
				 
			}
			else {
				for (String value: values) {
					
					select.selectByVisibleText(value);
				}
			}
		

			
		}
		
	}
}
