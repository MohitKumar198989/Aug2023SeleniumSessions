package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {


		WebDriver driver =new ChromeDriver();
		
		//Implicitly Wait
		//dynamic Wait
		//global wait: its applied for all the webelement (only for webelement)
		//applied after the driver intilization
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //selenium 3.x
		//selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		
		//e1--> 10 sec -->2 sec found: 8 sec
		//e1 --> 10 sec --> 10sec not visible: nosuchelement exc
		//e50
		
		//home page : 20 secs:

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e51,e52: 20 secs applied
		
		//login page
		//e1:
		
		//register page : 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//page: 0 secs: nullification of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		//login page :10 sec:2secs: 8sec will be ignored
		//email : 10 secs: 2 secs : 8 secs will be ignored
		//password: 10secs: 0secs : 10 secs will be ignored
		//login button
		
		//to optimize the wait : explicit wait: for the specific element
		//email : 10 secs: 2 secs : 8 secs will be ignored
		//password: no wait applied
		//login button : no wait applied
		
		//imp wait can not be used with non web elements(alerts, title, url)
		//exp wait can be used for non web elements 
		 
		
		
		
		
		
		
	}

}
