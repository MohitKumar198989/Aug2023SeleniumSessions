package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {


		//Action class :
		//user action : mouse and keyboard 

		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		By parentShopByMenu= By.xpath("(//span[text()='Shop by'])[2]");
		
		By BeveragesSecondMenu= By.linkText("Beverages");
		
		By teaThirdMenu = By.linkText("Tea");
		
		By GreenteaFrouthMenu = By.linkText("Green Tea");
		
//		Actions act = new Actions(driver);
//		
//		driver.findElement(parentShopByMenu).click();
//		
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(BeveragesSecondMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(teaThirdMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		driver.findElement(GreenteaFrouthMenu).click();
		
		fourLevelMenuHandle(parentShopByMenu, BeveragesSecondMenu, teaThirdMenu, GreenteaFrouthMenu);
	}

		public  static void fourLevelMenuHandle(By parentMenuLocator,By firstchildMenuLocator,By secondChildMenuLocator,By thirdChildMenuLocator ) throws InterruptedException {
		
			Actions act = new Actions(driver);
		
			driver.findElement(parentMenuLocator).click();;
		
			Thread.sleep(1000);
		
			act.moveToElement(driver.findElement(firstchildMenuLocator)).build().perform();
		
		 
			Thread.sleep(1000);
		
			act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
		
			Thread.sleep(1000);
		
			driver.findElement(thirdChildMenuLocator);
		
	}
}
