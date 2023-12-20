package seleniumsessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuValue {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//BrowserUtil brUtil = new BrowserUtil();
		
		//ElementUtil eleUtil = new ElementUtil(brUtil.launchBrowser("chrome"));
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		By parentMenuLocator=  By.xpath("(//span[text()='Shop by'])[2]");
//		/html/body/div[2]/div[1]/header[2]/div[2]/div[1]/div[1]/div/div/nav/ul[1]
		
		//driver.findElement(parentMenuLocator).click();
		//By mainMenuDiv=By.cssSelector("li.jsx-1259984711");
		//By mainMenuDiv=By.cssSelector(" ");
		//By mainMenuDiv=  By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[1]/div[1]/div/div/nav/ul[1]");
//		By mainMenuDiv=  By.xpath("//ul[@role='none'][1]");
		//List<WebElement> mainMenuOption1= eleUtil.getElements(mainMenuDiv);
		
//		List<WebElement> mainMenuOption =driver.findElements(mainMenuDiv);
//		List <String> l1 ;
//		l1.add(mainMenuOption);
		
//		 List<WebElement> elements = driver.findElements(By.linkText("name"));
//		 System.out.println("Number of elements:" +elements.size());
//		
//		System.out.println("Number of elements:" +mainMenuOption.size());

		
		//System.out.println(mainMenuOption);
//		for (WebElement e : mainMenuOption) {
//			String text=e.getText();
//			
//			System.out.println(text);
//			//System.out.println("------");
			//System.out.println(e.getSize());
			
//			
//			
//			
//			//String l2[]=text;
//			//l1.add(text);
//			
//			By MuneOptionSelect= By.linkText("l");
////			Actions act =new Actions(driver);	
////			act.moveToElement(driver.findElement(MuneOptionSelect));
////			Thread.sleep(1000);
//			
//			
	//	}
//		System.out.println(mainMenuOption.size());
//		
		//eleUtil.twoLevelMenu(parentMenuLocator, mainMenuDiv)
		
		
//		By mainMenuDiv2=  By.xpath("//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 cAslOa']//ul[@role='none'][1]//li");
//		List<WebElement> mainMenuOption2 =driver.findElements(mainMenuDiv2);
//		
//		for (WebElement e : mainMenuOption2) {
			
			//String text= e.getText();
			//System.out.println(text);
//			
//			Fruits & Vegetables
//			Foodgrains, Oil & Masala
//			Bakery, Cakes & Dairy
//			Beverages
//			Snacks & Branded Foods
//			Beauty & Hygiene
//			Cleaning & Household
//			Kitchen, Garden & Pets
//			Eggs, Meat & Fish
//			Gourmet & World Food
//			Baby Care
			
			
			// //div//ul[@class='jsx-1259984711 w-56 px-2.5 bg-silverSurfer-200 text-darkOnyx-800']//li[//a[@class='CategoryTree___StyledLink2-sc-8wbym9-1 mLodv']]
			
//			if(text.contains("Fruits & Vegetables")) {
//				
//				
//			}
			
//			for(int i=0;i<=text.length();i++) {
//			System.out.println(text.indexOf(i));
//			}
		//}
//
//		By FruitsVegetablesMenu=By.linkText("Fruits & Vegetables");
//		By FruitsVegetablesSubMenu2=By.linkText("Cuts & Sprouts");
//		By FruitsVegetablesSubMenu3=By.linkText("Cut & Peeled Veggies");
//		
		By SecoundMenuOptions=By.xpath("/html/body/div[2]/div[1]/header[2]/div[2]/div[1]/div[1]/div/div/nav/ul[2]");
		
		By thiredSubMenuOptions= By.xpath("//ul[@class='jsx-1259984711 w-56 px-2.5 bg-white text-darkOnyx-800 rounded-r-xs'][1]//li");
		//By MenuoptionsOnSubMenu= 
		
		//getTxetMenuOptions( FruitsVegetablesMenu);
		
//		fourLevelMenuHandle(parentMenuLocator, FruitsVegetablesMenu, FruitsVegetablesSubMenu2, FruitsVegetablesSubMenu3, SecoundMenuOptions, thiredSubMenuOptions);		
//		
//		By MainMenuOptionsecond=By.linkText("Foodgrains, Oil & Masala");
//		By SubMenuFirstOption=By.linkText("Atta, Flours & Sooji");
//		By SubMenuThirdFirstOption=By.linkText("Atta Whole Wheat");
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionsecond, SubMenuFirstOption, SubMenuThirdFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
//		By MainMenuOptionsecond=By.linkText("Bakery, Cakes & Dairy");
//		By SubMenuFirstOption=By.linkText("Bakery Snacks");
//		By SubMenuThirdFirstOption=By.linkText("Bread Sticks & Lavash");
		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionsecond, SubMenuFirstOption, SubMenuThirdFirstOption, SecoundMenuOptions, thiredSubMenuOptions);

//		By MainMenuOptionBeverages=By.linkText("Beverages");
//		By SubMenuFirstBeveragesOption=By.linkText("Coffee");
//		By SubMenuCoffeeFirstOption=By.linkText("Ground Coffee");
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionBeverages, SubMenuFirstBeveragesOption, SubMenuCoffeeFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
//		By MainMenuOptionSnacks=By.linkText("Snacks & Branded Foods");
//		By SubMenuFirstSnacksOption=By.linkText("Biscuits & Cookies");
//		By SubMenuBiscuitsCookiesFirstOption=By.linkText("Cookies");
//
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionSnacks, SubMenuFirstSnacksOption, SubMenuBiscuitsCookiesFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
//		By MainMenuOptionBeautyHygiene=By.linkText("Beauty & Hygiene");
//		By SubMenuFirstBathAndHandWashOption=By.linkText("Bath & Hand Wash");
//		By SubMenuBathAndHandWashFirstOption=By.linkText("Bath Salts & Oils");
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionBeautyHygiene, SubMenuFirstBathAndHandWashOption, SubMenuBathAndHandWashFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
//		By MainMenuOptionCleaningHousehold=By.linkText("Cleaning & Household");
//		By SubMenuOption=By.linkText("All Purpose Cleaners");
//		By SubMenuFirstOption=By.linkText("Descaler");
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionCleaningHousehold, SubMenuOption, SubMenuFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
		
//		By MainMenuOptionKitchenGardenPets=By.linkText("Kitchen, Garden & Pets");
//		By SubMenuOptionAppliancesElectricals=By.linkText("Appliances & Electricals");
//		By SubMenuFirstOption=By.linkText("Air Fryers & Rice Cookers");
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionKitchenGardenPets, SubMenuOptionAppliancesElectricals, SubMenuFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
//		By MainMenuOptionEggsMeatFish=By.linkText("Eggs, Meat & Fish");
//		By SubMenuOptionFistOption=By.linkText("Eggs");
//		By SubMenuSubFirstOption=By.linkText("Country Eggs");
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionEggsMeatFish, SubMenuOptionFistOption, SubMenuSubFirstOption, SecoundMenuOptions, thiredSubMenuOptions);
		
		
//		By MainMenuOptionGourmetWorldFood=By.linkText("Gourmet & World Food");
//		By SubMenuOptionCerealsBreakfast=By.linkText("Cereals & Breakfast");
//		By SubMenuSubFistOptionCerealsBreakfast=By.linkText("Cereal & Granola Bars");
//		
//		
//		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionGourmetWorldFood, SubMenuOptionCerealsBreakfast, SubMenuSubFistOptionCerealsBreakfast, SecoundMenuOptions, thiredSubMenuOptions);
		
		By MainMenuOptionBabyCare=By.linkText("Baby Care");
		By SubMenuOptionBabyAccessories=By.linkText("Baby Accessories");
		By SubMenuSubFistOptionBabyGearOutdoor=By.linkText("Baby Gear & Outdoor");
		
		fourLevelMenuHandle(parentMenuLocator, MainMenuOptionBabyCare, SubMenuOptionBabyAccessories, SubMenuSubFistOptionBabyGearOutdoor, SecoundMenuOptions, thiredSubMenuOptions);
		
		driver.quit();
		
	}
	public static void getTxetMenuOptions( By FruitsVegetablesMenu) throws InterruptedException {
		Actions act =new Actions(driver);
		ElementUtil eleUtil = new ElementUtil(driver);
		act.moveToElement(driver.findElement(eleUtil.getBy("linkText", "Fruits & Vegetables"))).build().perform();
		String fruit_Veg=eleUtil.doElementGetText(FruitsVegetablesMenu);
		System.out.println(fruit_Veg);
		//act.moveToElement(driver.findElement(FruitsVegetablesMenu));
		Thread.sleep(1000);
		
		eleUtil.getElements(FruitsVegetablesMenu);
		
		act.moveToElement(driver.findElement(eleUtil.getBy("linkText", "Cuts & Sprouts"))).build().perform();
		
		By FruitsVegetablesMenu2=By.linkText("Cuts & Sprouts");
		String FruitsVegetablesMenu3=eleUtil.doElementGetText(FruitsVegetablesMenu2);
		System.out.println(FruitsVegetablesMenu3);
	
	}
	
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
		
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void fourLevelMenuHandle(By parentMenuLocator, By firstchildMenuLocator, By secondChildMenuLocator,
			By thirdChildMenuLocator, By SecoundMenuOptions, By thiredSubMenuOptions) throws InterruptedException {

		Actions act = new Actions(driver);
		//act.scrollByAmount(0, 70);
		Thread.sleep(2000);
		
		driver.findElement(parentMenuLocator).click();
		

		Thread.sleep(1000);

		act.moveToElement(driver.findElement(firstchildMenuLocator)).build().perform();
		String firstchildMenuLocatortext = driver.findElement(firstchildMenuLocator).getText();
		//act.scrollToElement(driver.findElement(firstchildMenuLocator));
		//act.scrollByAmount(0, 10);
		System.out.println("MainMenutext:-");
		
		System.out.println(firstchildMenuLocatortext);
		
		System.out.println();
		
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
		// String secondChildMenuLocatorText=
		// driver.findElement(secondChildMenuLocator).getText();
		// System.out.println(secondChildMenuLocatorText);
		System.out.println("SubMenuOpstios are:-");
		List<WebElement> SecoundMenuOptions1 = driver
				.findElements(SecoundMenuOptions);
		for (WebElement e : SecoundMenuOptions1) {
			String text = e.getText();
			
			System.out.println(text);
			
		}
		System.out.println();

		Thread.sleep(1000);

		act.moveToElement(driver.findElement(thirdChildMenuLocator)).build().perform();
		
		String thirdChildMenuLocatorText = driver.findElement(thirdChildMenuLocator).getText();
		//System.out.println(thirdChildMenuLocatorText);
		//List<WebElement> thiredSubMenuOptions = driver.findElements(
		//		By.xpath("/html/body/div[2]/div[1]/header[1]/div[2]/div[1]/div[2]/div[1]/div/div/nav/ul[3]"));
		//List<WebElement> thiredSubMenuOptions= driver.findElements(By.cssSelector("#headlessui-menu-items-\\:R1769b6\\: > nav > ul.jsx-1259984711.w-56.px-2\\.5.bg-white.text-darkOnyx-800.rounded-r-xs"));
		System.out.println("thiredSubMenuOptions are:-");
		List<WebElement> thiredSubMenuOptions1 =driver.findElements(thiredSubMenuOptions);
		// System.out.println(thirdChildMenuLocatorText);
		
		for (WebElement e : thiredSubMenuOptions1) {
			String text1 = e.getText();
			if(text1.length()!=0) {
			System.out.println(text1);
			
		}
			Thread.sleep(1000);
			//driver.findElement(parentMenuLocator).click();
			
		
			act.scrollToElement(driver.findElement(firstchildMenuLocator));

	}
	
}
}
