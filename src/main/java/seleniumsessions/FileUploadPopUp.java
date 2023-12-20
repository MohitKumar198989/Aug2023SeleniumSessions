package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver(); //Browser
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html"); //page
		
		//<tag type='file'> should be there
		//99.99% type = to type is there
		//1. ask dev to add that type=file
		//2. 3rd party libs:AutoIT(windows-- windows batch),Robot(windows), sikuli(image based)
		driver.findElement(By.name("upfile")).sendKeys("Path of the file");
		//if need to upload the multiple file done by one by one
		driver.findElement(By.name("upfile")).sendKeys("Path of the 2nd file");

		
		
	}

}
