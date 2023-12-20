package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//123
		
		driver.get("https://www.google.com");//123
		
		String actTitle=  driver.getTitle();//123
		System.out.println("Title is : " +actTitle);
		
		driver.quit(); //quit the brower 123
		
		
		driver = new ChromeDriver();  //sid 456
		driver.get("https://www.google.com");  //sid 456
		System.out.println(driver.getTitle());  //sid 456
		//NoSuchSessionExpection: Session Id is null. Using WebDriver after calling quit
	}

}
