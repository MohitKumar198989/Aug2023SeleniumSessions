package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageGetAttribute {

		//static WebDriver driver;

		public static void main(String[] args) {


//			driver=new ChromeDriver();//123
//			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

			BrowserUtil brUtil= new BrowserUtil();
			//brUtil.launchBrowser("Chrome");
			//brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			ElementUtil eleUtil = new ElementUtil(brUtil.launchBrowser("Chrome"));
			brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By registerLink =By.linkText("Register");
			eleUtil.doClick(registerLink);
			
			//with String 
			
//			eleUtil.doSendKeys("id", "input-firstname","Tom");
//			eleUtil.doSendKeys("id", "input-lastname", "K");
//			eleUtil.doSendKeys("id", "input-email", "Tom@gmail.com");
//			eleUtil.doSendKeys("id", "input-telephone", "1213312121");
//			eleUtil.doSendKeys("id","input-password", "tom@123");
//			eleUtil.doSendKeys("id","input-confirm", "tom@123");
//			
//			System.out.println(eleUtil.getElement("id", "input-firstname").getAttribute("value"));
//			System.out.println(eleUtil.getElement("id", "input-lastname").getAttribute("value"));
//			System.out.println(eleUtil.getElement("id", "input-email").getAttribute("value"));
//			System.out.println(eleUtil.getElement("id", "input-telephone").getAttribute("value"));
//			System.out.println(eleUtil.getElement("id", "input-password").getAttribute("value"));
//			System.out.println(eleUtil.getElement("id", "input-confirm").getAttribute("value"));
			
			//with By locator
			
			By firstname= By.id("input-firstname");
			By lastname = By.id("input-lastname");
			By email= By.id("input-email");
			By telephone= By.id("input-telephone");
			By password= By.id("input-password");
			By confirmPwd= By.id("input-confirm");
			
			
			eleUtil.doSendKeys(firstname, "Tom");
			eleUtil.doSendKeys(lastname, "K");
			eleUtil.doSendKeys( email,"Tom@gmail.com");
			eleUtil.doSendKeys(telephone, "1213312121");
			eleUtil.doSendKeys(password, "tom@123");
			eleUtil.doSendKeys(confirmPwd, "tom@123");
			
			System.out.println(eleUtil.doGetElementAttribute(firstname, "value"));
			System.out.println(eleUtil.doGetElementAttribute(lastname, "value"));
			System.out.println(eleUtil.doGetElementAttribute(email, "value"));
			System.out.println(eleUtil.doGetElementAttribute(telephone, "value"));
			System.out.println(eleUtil.doGetElementAttribute(password, "value"));
			System.out.println(eleUtil.doGetElementAttribute(confirmPwd, "value"));
			
			
	}

}
