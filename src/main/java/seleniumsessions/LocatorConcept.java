package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//1.id is an attribute : unique I
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
		//2. name : is an attribute : can be duplicate  II
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3: class name : is an attribute : can be duplicate  III
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		//c1
		//c1 c2 c3...cn
		
		//4. xpath: not an attribute. This is the address of the element in the DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		By loginBtn= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendKeys(eId, "Test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doClick(loginBtn);
		
		//5. cssSelector:  not an attribute.
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("Test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//	
//		By emailId = By.id("input-email");
//		By pwd = By.id("input-password");
//		By loginBtn= By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		
//		doSendKeys(emailId, "Test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doClick(loginBtn);
		
		//6 : linkText: only for links. Link test is not an attribute, this is the text of the link.
		//html tag : <a> anchor tag
		//link text : can be duplicate
		
		//driver.findElement(By.linkText("Register")).click(); 
		
//		By registerLink=By.linkText("Register");
//		doClick(registerLink);
	
		//7: partialLinkText : only for links.
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//Forgotten Password
		//Forgotten user
		
		
		//8 tagName: html tag
//		String header =driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		
		By header=By.tagName("h2");
		String headerValue =doElementGetText(header);
		if(headerValue.equals("New Customer")) {
			System.out.println("header is correct....Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		By logoImg=By.className("img-responsive");
		doClick(logoImg);
		
		//id
		//name
		//className
		//xpath
		//css
		//linkText
		//partialLinkText
		//tagName
		
		//id-->#
		//class-->.
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
