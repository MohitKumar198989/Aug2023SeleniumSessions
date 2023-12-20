package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//window
		System.setProperty("webdriver.chrome.driver", "D:\\Software coding\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		
		//mac/linux
		//System.setProperty("webdriver.chrome.driver", "D:\Software coding\ChromeDriver\ChromeDriver");

		WebDriver driver = new ChromeDriver();
		//browser 118--> 118.exe
		//
		driver.get("https://www.google.com");
		
		//4.6.0+ --> 4.13.0
		//browser 118 --> 118.exe from CFT Dashboard in your .cache folder and will start the server automatically 
		
		
	}

}
