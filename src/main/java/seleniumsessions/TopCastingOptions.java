package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//Local machine but only for the specific browser
		//1. ChromeDriver driver = new ChromeDriver();
		
		// valid + recommended : Local machine + cross browser
		//2. WebDriver driver = new ChromeDriver();
		
		//3. valid + not recommended
		//SearchContext driver = new ChromeDriver();
		//4. valid + recommended
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. valid + recommended : to test on grid/remote machine/cloud
		//WebDriver driver = new RemoteWebDriver(ip address of remote machine , null);
		
		//6. valid + not recommended
		//ChromiumDriver driver = new ChromeDriver();
	}

}
