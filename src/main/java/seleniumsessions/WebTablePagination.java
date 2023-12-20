package seleniumsessions;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");

		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		// String countryName = "Ukraine" ;

		// By nextXpath=By.linkText("Next");

		// By countryNameXpath = By.xpath("//td[text()='"+countryName+"']");
		// selectCountrySingleOption(countryName,countryNameXpath,nextXpath);

		// multiple selection

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");
				
			}

			// pagination logic:
			WebElement next = driver.findElement(By.linkText("Next"));

			if (next.getAttribute("class").contains("disable")) {
				System.out.println("pagination is over .. country is not found");
				break;
			}
			next.click();
			Thread.sleep(1000);
		}

		// single selection
//		while(true) {
//			//if element is on the 1st page itself
//			if(driver.findElements(By.xpath("//td[text()='Ukraine']")).size()>0) {
//				selectCountry("Ukraine");
//				break;
//			}
//			else {
//				//pagination logic:
//				WebElement next=driver.findElement(By.linkText("Next"));
//				
//				if (next.getAttribute("class").contains("disable")) {
//					System.out.println("pagination is over .. country is not found");
//					break;
//				}
//				
//					next.click();
//				Thread.sleep(1000);
//			}
//			
//		}	

	}

	public static void selectMultipleCountry(String countryName) {
		List<WebElement> eles = driver.findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : eles) {
				e.click();
		}
	}


	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

	public static void selectCountrySingleOption(String countryName, By locator, By Nextlocator)
			throws InterruptedException {

		while (true) {
			// if element is on the 1st page itself
			if (driver.findElements(locator).size() > 0) {
				selectCountry(countryName);
				break;
			} else {
				// pagination logic:
				WebElement next = driver.findElement(Nextlocator);

				if (next.getAttribute("class").contains("disable")) {
					System.out.println("pagination is over .. country is not found");
					break;
				}

				next.click();
				Thread.sleep(1000);
			}

		}

	}
}
