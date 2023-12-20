package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssginmentBigbasket {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		//driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		By parentMenuLocator=  By.xpath("(//span[text()='Shop by'])[2]");
		//WebElement BeautyHygieneEle =driver.findElement(By.linkText("Beauty & Hygiene"));
		By ele1= By.linkText("Fruits & Vegetables");
		//WebElement MakeupEle =driver.findElement(By.linkText("Makeup"));
		By ele2 = By.linkText("Fresh Fruits");
		//WebElement MakeupAccessoriesEle =driver.findElement(By.linkText("Makeup Accessories"));
		By ele3= By.linkText("Mangoes");
		//driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:R2lmb6:\"]/div/span[2]")).click();
		
		
		Thread.sleep(1000);
		
//		Actions act=new Actions(driver);
//		//driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
//		act.moveToElement(BeautyHygieneEle).build().perform();
//		//act.moveToElement(driver.findElement(ele1)).build().perform();
//		Thread.sleep(1000);
//		
//		//act.moveToElement(MakeupEle).build().perform();
//		act.moveToElement(driver.findElement(ele2)).build().perform();
//		Thread.sleep(1000);
//		
//		//act.moveToElement(MakeupAccessoriesEle).build().perform();
//		driver.findElement(ele3).click();
//		
		multiMenuHandle(parentMenuLocator, ele1, ele2, ele3);
		
		

	}

		public static void multiMenuHandle(By parentMenuLocator,By firstchildMenuLocator,By secondChildMenuLocator,By thirdChildMenuLocator ) throws InterruptedException {
			ElementUtil eleUtil = new ElementUtil(driver);
			
			
			Actions act = new Actions(driver);
			
			driver.findElement(parentMenuLocator).click();
			
			
			Thread.sleep(1000);
			
			List<WebElement> listMenuOption= eleUtil.getElements(firstchildMenuLocator);
			
			//ArrayList<String> in = new ArrayList<>();
			//for(int i = 0; i < (n+10); i++)
			  //in.add(e)
			  System.out.println("Menu text :");
				//ArrayList<String> in = new ArrayList<>();
			for (WebElement e : listMenuOption) {
				String text= e.getText();
				System.out.println(text);
				System.out.println("*****");
				System.out.println(e.getSize());
			
				//in.add(e);
				
				//System.out.println(in.get(1));
				
			}
			act.moveToElement(driver.findElement(firstchildMenuLocator)).build().perform();
			System.out.println(eleUtil.doElementGetText(firstchildMenuLocator));
			 
			Thread.sleep(1000);
			
			
			act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
			
			Thread.sleep(1000);
			
			driver.findElement(thirdChildMenuLocator).click();
			
		}
		
//		public static void getMenuValueMenuOption(By parentMenuLocator,By firstchildMenuLocator,By secondChildMenuLocator,By thirdChildMenuLocator  ) {
//			
//		}
}
