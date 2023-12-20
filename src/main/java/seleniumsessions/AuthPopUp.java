package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver(); //Browser
		
		String userName="admin";
		String password="test";
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth"); //page
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); when user name and password is admin
		//driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");if password is having @123 then it is not working

		//Basic Auth
		driver.get("https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

		// other Authentication also like Auth 1.0, Auth2.0 jwtToken, API Keys 
		//on Browser basic Auth is there 
		
	}

}
