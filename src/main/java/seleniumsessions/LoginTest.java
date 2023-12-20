package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String email_Id = "input-email";
		String password_Id = "input-password";
		String loginBnt= "//*[@id=\"content\"]/div/div[2]/div/form/input";
		String register_LinkText = "Register";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", email_Id, "test@gmail.com");
		eleUtil.doSendKeys("id", password_Id, "test@123");
		eleUtil.doClick("xpath", loginBnt);
		
		String registerValue= eleUtil.doElementGetText("linktext", register_LinkText);
		System.out.println(registerValue);
	}
}
