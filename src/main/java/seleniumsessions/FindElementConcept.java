package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email11111"));
		//no such element: Unable to locate element: 
		
//		int totalBill = 123;
//		String totalBillAmount=String.valueOf(totalBill) ; 
//		driver.findElement(By.id("input-email")).sendKeys(totalBillAmount);
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		// java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		//sendKeys : String , stringbuilder, Stringbuffer
		StringBuilder sb = new StringBuilder("Test");
		//driver.findElement(By.id("input-email")).sendKeys(sb);
		
		driver.findElement(By.id("input-email")).sendKeys(sb+"automation");		
		
		//CharSequence (I) <-- String , stringbuilder, Stringbuffer
	}

}
