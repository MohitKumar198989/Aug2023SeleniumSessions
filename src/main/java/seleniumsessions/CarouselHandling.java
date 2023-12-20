package seleniumsessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CarouselHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		driver.get("https://www.noon.com/uae-en/");

		Thread.sleep(5000);
		
		getCarouselItems();
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	public static void getCarouselItems() throws InterruptedException {
		Thread.sleep(5000);

		String xpath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-17']/following-sibling::div//div[@data-qa='product-name']";
		String nextXpath = "//img[contains(@alt,'yellow-friday-selling-fast-uae')]/ancestor::div[@class='componentArea-17']/following-sibling::div[@class='componentArea-18']//div[contains(@class,'swiper-button-next')]";

		List<WebElement> productList = driver.findElements(By.xpath(xpath));
		System.out.println(productList.size());

		//List<String> productNamesList = new ArrayList<String>();
		Set <String> productSet = new HashSet<String>();
		
		while (!driver.findElement(By.xpath(nextXpath)).getAttribute("class").contains("swiper-button-disabled")) {
			for (WebElement e : productList) {
				String productName = e.getAttribute("title");
				productSet.add(productName);
			}
			driver.findElement(By.xpath(nextXpath)).click();
		}
		//print the products:
		for (String e : productSet) {
			System.out.println(e);
		}

	}
}
