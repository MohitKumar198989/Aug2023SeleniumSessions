package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRediffPopUp {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Alert alert= driver.switchTo().alert(); 
		
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		By userName = By.xpath("//input[@id='login1']");
		
		driver.findElement(userName).sendKeys("sasasasa");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Alert alert1= driver.switchTo().alert(); 
		
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert.accept();
		
		driver.quit();
		}

//	public static void doAlertGetText(Alert alert) {
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
//	}
//
//	public static Alert doSwitchToAlert() {
//		Alert alert = driver.switchTo().alert();
//		return alert;
//	}
}

