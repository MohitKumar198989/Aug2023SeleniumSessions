package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		
		System.out.println(driver.getTitle());

		driver.navigate().back();
		
		System.out.println(driver.getTitle());

		//driver.get("https://naveenautomationlabs.com/opencart/");
		driver.navigate().to(new URL("https://naveenautomationlabs.com/opencart/"));
		
		driver.navigate().refresh(); //refresh the page
		
		//050(octal number) base is 8 -40
		//50 (decimal number) base is 2 
		System.out.println(050);
		
		//050 --> 0 + 5 + 0
		//050 = (0 × 8²) + (5 × 8¹) + (0 × 8⁰) = 40
		
		//System.out.println(089);//0-7
	}

}
